package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CreativeCommonsOff: ImageVector
    get() {
        if (_creativeCommonsOff != null) return _creativeCommonsOff!!
        _creativeCommonsOff = tablerOutlineIcon(
            name = "CreativeCommonsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.638f, 5.634f),
                    PathNode.CurveTo(2.121879f, 9.14736f, 2.11964f, 14.84588f, 5.633f, 18.362f),
                    PathNode.CurveTo(9.146359f, 21.87812f, 14.844879f, 21.88036f, 18.361f, 18.367f),
                    PathNode.MoveTo(20.047f, 16.035f),
                    PathNode.CurveTo(21.789795f, 12.565825f, 21.111567f, 8.370097f, 18.364527f, 5.626692f),
                    PathNode.CurveTo(15.617487f, 2.883286f, 11.420864f, 2.210614f, 7.954f, 3.958f)
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
                    PathNode.MoveTo(10.5f, 10.5f),
                    PathNode.CurveTo(9.64088f, 9.790886f, 8.386035f, 9.840838f, 7.586f, 10.616f),
                    PathNode.CurveTo(7.211597f, 10.979118f, 7.000285f, 11.478433f, 7.000285f, 12.0f),
                    PathNode.CurveTo(7.000285f, 12.521567f, 7.211597f, 13.020882f, 7.586f, 13.384f),
                    PathNode.CurveTo(8.386227f, 14.158713f, 9.640724f, 14.208652f, 10.5f, 13.5f)
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
                    PathNode.MoveTo(16.5f, 10.5f),
                    PathNode.CurveTo(15.851665f, 9.965486f, 14.954995f, 9.848207f, 14.191f, 10.198f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
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
        return _creativeCommonsOff!!
    }

private var _creativeCommonsOff: ImageVector? = null
