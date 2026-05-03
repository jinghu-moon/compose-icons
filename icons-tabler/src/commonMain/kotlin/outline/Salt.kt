package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Salt: ImageVector
    get() {
        if (_salt != null) return _salt!!
        _salt = tablerOutlineIcon(
            name = "Salt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.LineTo(12.0f, 13.01f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 16.0f),
                    PathNode.LineTo(10.0f, 16.01f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 16.0f),
                    PathNode.LineTo(14.0f, 16.01f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.5f, 8.0f),
                    PathNode.LineTo(16.5f, 8.0f),
                    PathNode.LineTo(16.219f, 5.752f),
                    PathNode.CurveTo(16.093904f, 4.750947f, 15.242839f, 3.99978f, 14.234f, 4.0f),
                    PathNode.LineTo(9.766f, 4.0f),
                    PathNode.CurveTo(8.75678f, 3.999276f, 7.905144f, 4.750569f, 7.78f, 5.752f),
                    PathNode.LineTo(7.5f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.5f, 8.0f),
                    PathNode.LineTo(5.888f, 17.671f),
                    PathNode.CurveTo(5.791277f, 18.250973f, 5.954665f, 18.844126f, 6.334728f, 19.292765f),
                    PathNode.CurveTo(6.71479f, 19.741405f, 7.273017f, 20.000072f, 7.861f, 20.0f),
                    PathNode.LineTo(16.139f, 20.0f),
                    PathNode.CurveTo(16.726984f, 20.000072f, 17.28521f, 19.741405f, 17.665272f, 19.292765f),
                    PathNode.CurveTo(18.045336f, 18.844126f, 18.208723f, 18.250973f, 18.112f, 17.671f),
                    PathNode.LineTo(16.5f, 8.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _salt!!
    }

private var _salt: ImageVector? = null
