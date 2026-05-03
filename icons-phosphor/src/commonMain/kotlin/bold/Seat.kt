package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorBoldIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 232.0f),
                    PathNode.CurveTo(228.0f, 238.62741f, 222.62741f, 244.0f, 216.0f, 244.0f),
                    PathNode.LineTo(112.0f, 244.0f),
                    PathNode.CurveTo(105.37258f, 244.0f, 100.0f, 238.62741f, 100.0f, 232.0f),
                    PathNode.CurveTo(100.0f, 225.37259f, 105.37258f, 220.0f, 112.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(222.62741f, 220.0f, 228.0f, 225.37259f, 228.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 160.0f),
                    PathNode.LineTo(228.0f, 188.0f),
                    PathNode.CurveTo(228.0f, 199.0457f, 219.0457f, 208.0f, 208.0f, 208.0f),
                    PathNode.LineTo(112.1f, 208.0f),
                    PathNode.CurveTo(104.5164f, 208.02332f, 97.57877f, 203.73433f, 94.21f, 196.94f),
                    PathNode.LineTo(38.1f, 85.0f),
                    PathNode.CurveTo(35.299686f, 79.3619f, 35.299686f, 72.7381f, 38.1f, 67.1f),
                    PathNode.LineTo(60.22f, 23.0f),
                    PathNode.CurveTo(65.13789f, 13.164479f, 77.073685f, 9.14419f, 86.94f, 14.0f),
                    PathNode.LineTo(116.75f, 28.27f),
                    PathNode.LineTo(116.93f, 28.36f),
                    PathNode.CurveTo(126.8101f, 33.297665f, 130.81706f, 45.3096f, 125.88f, 55.19f),
                    PathNode.LineTo(125.71f, 55.52f),
                    PathNode.LineTo(112.5f, 80.08f),
                    PathNode.LineTo(142.25f, 140.0f),
                    PathNode.LineTo(208.0f, 140.0f),
                    PathNode.CurveTo(219.0457f, 140.0f, 228.0f, 148.9543f, 228.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 164.0f),
                    PathNode.LineTo(139.77f, 164.0f),
                    PathNode.CurveTo(132.1864f, 164.02332f, 125.24877f, 159.73433f, 121.88f, 152.94f),
                    PathNode.LineTo(90.09f, 88.94f),
                    PathNode.CurveTo(87.29516f, 83.31468f, 87.29516f, 76.705315f, 90.09f, 71.08f),
                    PathNode.CurveTo(90.15f, 70.97f, 90.21f, 70.86f, 90.26f, 70.75f),
                    PathNode.LineTo(102.46f, 48.13f),
                    PathNode.LineTo(79.91f, 37.3f),
                    PathNode.LineTo(60.47f, 76.0f),
                    PathNode.LineTo(114.57f, 184.0f),
                    PathNode.LineTo(204.0f, 184.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _seat!!
    }

private var _seat: ImageVector? = null
