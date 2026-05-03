package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorFillIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.3f, 43.31f),
                    PathNode.CurveTo(188.09203f, 43.13233f, 187.87508f, 42.965446f, 187.65f, 42.81f),
                    PathNode.CurveTo(187.42f, 42.65f, 187.18f, 42.5f, 186.94f, 42.36f),
                    PathNode.CurveTo(140.59097f, 8.856766f, 75.877426f, 19.132357f, 42.186115f, 65.34486f),
                    PathNode.CurveTo(8.494806f, 111.55736f, 18.50733f, 176.31212f, 64.582535f, 210.19095f),
                    PathNode.CurveTo(110.65774f, 244.06978f, 175.45267f, 234.32048f, 209.51845f, 188.38333f),
                    PathNode.CurveTo(243.58423f, 142.44618f, 234.09831f, 77.61218f, 188.3f, 43.36f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(114.74516f, 152.0f, 104.0f, 141.25484f, 104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 114.74516f, 114.74516f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(141.25484f, 104.0f, 152.0f, 114.74516f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 141.25484f, 141.25484f, 152.0f, 128.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 130.47f, 215.89f, 132.92f, 215.69f, 135.34f),
                    PathNode.LineTo(168.0f, 126.92f),
                    PathNode.CurveTo(167.73062f, 117.05817f, 163.81088f, 107.64724f, 157.0f, 100.51f),
                    PathNode.LineTo(184.78f, 60.84f),
                    PathNode.CurveTo(204.58136f, 77.527374f, 216.00641f, 102.10478f, 216.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _disc!!
    }

private var _disc: ImageVector? = null
