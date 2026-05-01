package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.Signature: ImageVector
    get() {
        if (_signature != null) return _signature!!
        _signature = lucideOutlineIcon(
            name = "Signature",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 17.0f),
                    PathNode.LineTo(18.844f, 15.132f),
                    PathNode.CurveTo(18.698322f, 14.993872f, 18.484156f, 14.956265f, 18.300135f, 15.036503f),
                    PathNode.CurveTo(18.116112f, 15.116739f, 17.997925f, 15.299258f, 18.0f, 15.5f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.CurveTo(18.0f, 16.552284f, 17.552284f, 17.0f, 17.0f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.CurveTo(14.447715f, 17.0f, 14.0f, 16.552284f, 14.0f, 16.0f),
                    PathNode.CurveTo(14.0f, 13.455f, 10.009f, 12.03f, 5.5f, 12.0f),
                    PathNode.CurveTo(4.119288f, 12.0f, 3.0f, 13.119288f, 3.0f, 14.5f),
                    PathNode.CurveTo(3.0f, 15.880712f, 4.119288f, 17.0f, 5.5f, 17.0f),
                    PathNode.CurveTo(9.653f, 17.0f, 10.245f, 5.705f, 11.208f, 3.5f),
                    PathNode.CurveTo(11.65538f, 2.476391f, 12.727558f, 1.873817f, 13.834541f, 2.023857f),
                    PathNode.CurveTo(14.941525f, 2.173898f, 15.814619f, 3.040134f, 15.973385f, 4.1459f),
                    PathNode.CurveTo(16.13215f, 5.251666f, 15.538049f, 6.328562f, 14.518f, 6.784f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.LineTo(21.0f, 21.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _signature!!
    }

private var _signature: ImageVector? = null
