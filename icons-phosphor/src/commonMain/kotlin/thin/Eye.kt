package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorThinIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.66f, 126.38f),
                    PathNode.CurveTo(243.32f, 125.62f, 235.14f, 107.49f, 216.83f, 89.18f),
                    PathNode.CurveTo(199.87f, 72.22f, 170.7f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(85.3f, 52.0f, 56.13f, 72.22f, 39.17f, 89.18f),
                    PathNode.CurveTo(20.86f, 107.49f, 12.68f, 125.62f, 12.34f, 126.38f),
                    PathNode.CurveTo(11.889905f, 127.41658f, 11.889905f, 128.59341f, 12.34f, 129.63f),
                    PathNode.CurveTo(12.68f, 130.4f, 20.86f, 148.52f, 39.17f, 166.83f),
                    PathNode.CurveTo(56.17f, 183.83f, 85.31f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(170.69f, 204.0f, 199.87f, 183.79f, 216.83f, 166.83f),
                    PathNode.CurveTo(235.14f, 148.52f, 243.32f, 130.4f, 243.66f, 129.63f),
                    PathNode.CurveTo(244.11009f, 128.59341f, 244.11009f, 127.41658f, 243.66f, 126.38f),
                    PathNode.Close,
                    PathNode.MoveTo(210.96f, 161.38f),
                    PathNode.CurveTo(187.89f, 184.38f, 159.96f, 196.0f, 127.96f, 196.0f),
                    PathNode.CurveTo(95.96f, 196.0f, 68.07f, 184.35f, 44.96f, 161.38f),
                    PathNode.CurveTo(35.126907f, 151.57346f, 26.857286f, 140.31572f, 20.44f, 128.0f),
                    PathNode.CurveTo(26.869226f, 115.68143f, 35.152477f, 104.42349f, 45.0f, 94.62f),
                    PathNode.CurveTo(68.11f, 71.65f, 96.0f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(160.0f, 60.0f, 187.89f, 71.65f, 211.0f, 94.62f),
                    PathNode.CurveTo(220.84631f, 104.42453f, 229.12943f, 115.68227f, 235.56f, 128.0f),
                    PathNode.CurveTo(229.13051f, 140.3184f, 220.84727f, 151.5763f, 211.0f, 161.38f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(103.69947f, 84.0f, 84.0f, 103.69947f, 84.0f, 128.0f),
                    PathNode.CurveTo(84.0f, 152.30052f, 103.69947f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(152.30052f, 172.0f, 172.0f, 152.30052f, 172.0f, 128.0f),
                    PathNode.CurveTo(171.97244f, 103.71089f, 152.28911f, 84.02756f, 128.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(108.11775f, 164.0f, 92.0f, 147.88223f, 92.0f, 128.0f),
                    PathNode.CurveTo(92.0f, 108.11775f, 108.11775f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(147.88223f, 92.0f, 164.0f, 108.11775f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 147.88223f, 147.88223f, 164.0f, 128.0f, 164.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _eye!!
    }

private var _eye: ImageVector? = null
