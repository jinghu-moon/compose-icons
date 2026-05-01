package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PhonePause: ImageVector
    get() {
        if (_phonePause != null) return _phonePause!!
        _phonePause = phosphorRegularIcon(
            name = "PhonePause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(214.36f, 166.46f),
                    PathNode.LineTo(167.26f, 145.35f),
                    PathNode.LineTo(167.14f, 145.29f),
                    PathNode.CurveTo(162.16856f, 143.16124f, 156.45824f, 143.6879f, 151.96f, 146.69f),
                    PathNode.CurveTo(151.69943f, 146.86209f, 151.44902f, 147.04907f, 151.21f, 147.25f),
                    PathNode.LineTo(126.87f, 168.0f),
                    PathNode.CurveTo(111.45f, 160.51f, 95.53f, 144.71f, 88.04f, 129.49f),
                    PathNode.LineTo(108.82f, 104.78f),
                    PathNode.CurveTo(109.02f, 104.53f, 109.21f, 104.28f, 109.39f, 104.01f),
                    PathNode.CurveTo(112.323395f, 99.52752f, 112.818886f, 93.874435f, 110.71f, 88.95f),
                    PathNode.LineTo(110.71f, 88.83f),
                    PathNode.LineTo(89.54f, 41.64f),
                    PathNode.CurveTo(86.720985f, 35.134975f, 79.95731f, 31.26072f, 72.92f, 32.12f),
                    PathNode.CurveTo(44.8889f, 35.80858f, 23.949318f, 59.7273f, 24.0f, 88.0f),
                    PathNode.CurveTo(24.0f, 167.4f, 88.6f, 232.0f, 168.0f, 232.0f),
                    PathNode.CurveTo(196.2727f, 232.05067f, 220.19142f, 211.1111f, 223.88f, 183.08f),
                    PathNode.CurveTo(224.73927f, 176.04268f, 220.86502f, 169.27902f, 214.36f, 166.46f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 216.0f),
                    PathNode.CurveTo(97.33954f, 215.92284f, 40.07716f, 158.66046f, 40.0f, 88.0f),
                    PathNode.CurveTo(39.922176f, 67.799286f, 54.84746f, 50.678223f, 74.87f, 48.0f),
                    PathNode.CurveTo(74.86606f, 48.0399f, 74.86606f, 48.080097f, 74.87f, 48.12f),
                    PathNode.LineTo(95.87f, 95.12f),
                    PathNode.LineTo(75.2f, 119.86f),
                    PathNode.CurveTo(74.9902f, 120.1014f, 74.79962f, 120.35886f, 74.63f, 120.63f),
                    PathNode.CurveTo(71.569214f, 125.32675f, 71.18984f, 131.28287f, 73.63f, 136.33f),
                    PathNode.CurveTo(82.69f, 154.86f, 101.36f, 173.39f, 120.09f, 182.44f),
                    PathNode.CurveTo(125.17489f, 184.85768f, 131.15628f, 184.42473f, 135.84f, 181.3f),
                    PathNode.CurveTo(136.09923f, 181.12688f, 136.34645f, 180.93645f, 136.58f, 180.73f),
                    PathNode.LineTo(160.89f, 160.0f),
                    PathNode.LineTo(207.89f, 181.06f),
                    PathNode.LineTo(207.89f, 181.06f),
                    PathNode.CurveTo(207.89f, 181.06f, 207.97f, 181.06f, 208.0f, 181.06f),
                    PathNode.CurveTo(205.34972f, 201.10811f, 188.22241f, 216.0688f, 168.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 104.0f),
                    PathNode.LineTo(192.0f, 48.0f),
                    PathNode.CurveTo(192.0f, 43.581722f, 195.58173f, 40.0f, 200.0f, 40.0f),
                    PathNode.CurveTo(204.41827f, 40.0f, 208.0f, 43.581722f, 208.0f, 48.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 108.41828f, 204.41827f, 112.0f, 200.0f, 112.0f),
                    PathNode.CurveTo(195.58173f, 112.0f, 192.0f, 108.41828f, 192.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 104.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 43.581722f, 155.58173f, 40.0f, 160.0f, 40.0f),
                    PathNode.CurveTo(164.41827f, 40.0f, 168.0f, 43.581722f, 168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 108.41828f, 164.41827f, 112.0f, 160.0f, 112.0f),
                    PathNode.CurveTo(155.58173f, 112.0f, 152.0f, 108.41828f, 152.0f, 104.0f),
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
        return _phonePause!!
    }

private var _phonePause: ImageVector? = null
