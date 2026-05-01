package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorDuotoneIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 56.0f),
                    PathNode.CurveTo(48.0f, 56.0f, 16.0f, 128.0f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 128.0f, 48.0f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(208.0f, 200.0f, 240.0f, 128.0f, 240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 128.0f, 208.0f, 56.0f, 128.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(105.90861f, 168.0f, 88.0f, 150.09138f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 105.90861f, 105.90861f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(150.09138f, 88.0f, 168.0f, 105.90861f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 150.09138f, 150.09138f, 168.0f, 128.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.31f, 124.76f),
                    PathNode.CurveTo(246.96f, 123.97f, 238.49f, 105.18f, 219.66f, 86.35f),
                    PathNode.CurveTo(194.57f, 61.26f, 162.88f, 48.0f, 128.0f, 48.0f),
                    PathNode.CurveTo(93.12f, 48.0f, 61.43f, 61.26f, 36.34f, 86.35f),
                    PathNode.CurveTo(17.51f, 105.18f, 9.0f, 124.0f, 8.69f, 124.76f),
                    PathNode.CurveTo(7.770128f, 126.82903f, 7.770128f, 129.19096f, 8.69f, 131.26f),
                    PathNode.CurveTo(9.04f, 132.05f, 17.51f, 150.83f, 36.34f, 169.66f),
                    PathNode.CurveTo(61.43f, 194.74f, 93.12f, 208.0f, 128.0f, 208.0f),
                    PathNode.CurveTo(162.88f, 208.0f, 194.57f, 194.74f, 219.66f, 169.66f),
                    PathNode.CurveTo(238.49f, 150.83f, 246.96f, 132.05f, 247.31f, 131.26f),
                    PathNode.CurveTo(248.22987f, 129.19096f, 248.22987f, 126.82903f, 247.31f, 124.76f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 192.0f),
                    PathNode.CurveTo(97.22f, 192.0f, 70.33f, 180.81f, 48.07f, 158.75f),
                    PathNode.CurveTo(38.936455f, 149.66695f, 31.165876f, 139.30954f, 25.0f, 128.0f),
                    PathNode.CurveTo(31.164215f, 116.6894f, 38.934967f, 106.331764f, 48.07f, 97.25f),
                    PathNode.CurveTo(70.33f, 75.19f, 97.22f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(158.78f, 64.0f, 185.67f, 75.19f, 207.93f, 97.25f),
                    PathNode.CurveTo(217.08134f, 106.32959f, 224.8689f, 116.68718f, 231.05f, 128.0f),
                    PathNode.CurveTo(223.84f, 141.46f, 192.43f, 192.0f, 128.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 80.0f),
                    PathNode.CurveTo(101.49033f, 80.0f, 80.0f, 101.49033f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 154.50967f, 101.49033f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(154.50967f, 176.0f, 176.0f, 154.50967f, 176.0f, 128.0f),
                    PathNode.CurveTo(175.97244f, 101.501755f, 154.49825f, 80.02756f, 128.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(110.32689f, 160.0f, 96.0f, 145.67311f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 110.32689f, 110.32689f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(145.67311f, 96.0f, 160.0f, 110.32689f, 160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 145.67311f, 145.67311f, 160.0f, 128.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _eye!!
    }

private var _eye: ImageVector? = null
