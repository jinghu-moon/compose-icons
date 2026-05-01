package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Prism: ImageVector
    get() {
        if (_prism != null) return _prism!!
        _prism = tablerOutlineIcon(
            name = "Prism",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 9.0f),
                    PathNode.LineTo(12.0f, 22.0f)
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
                    PathNode.MoveTo(19.0f, 17.17f),
                    PathNode.LineTo(13.02f, 21.655f),
                    PathNode.CurveTo(12.415556f, 22.108334f, 11.584444f, 22.108334f, 10.98f, 21.655f),
                    PathNode.LineTo(5.0f, 17.17f),
                    PathNode.CurveTo(4.370486f, 16.697865f, 4.0f, 15.956893f, 4.0f, 15.17f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(4.0f, 3.447715f, 4.447716f, 3.0f, 5.0f, 3.0f),
                    PathNode.LineTo(19.0f, 3.0f),
                    PathNode.CurveTo(19.552284f, 3.0f, 20.0f, 3.447715f, 20.0f, 4.0f),
                    PathNode.LineTo(20.0f, 15.17f),
                    PathNode.CurveTo(20.0f, 15.956893f, 19.629515f, 16.697865f, 19.0f, 17.17f)
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
                    PathNode.MoveTo(4.3f, 3.3f),
                    PathNode.LineTo(10.955f, 8.486f),
                    PathNode.CurveTo(11.569394f, 8.964819f, 12.430606f, 8.964819f, 13.045f, 8.486f),
                    PathNode.LineTo(19.7f, 3.3f)
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
        return _prism!!
    }

private var _prism: ImageVector? = null
