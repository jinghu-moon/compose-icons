package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonAsterisk: ImageVector
    get() {
        if (_hexagonAsterisk != null) return _hexagonAsterisk!!
        _hexagonAsterisk = tablerOutlineIcon(
            name = "HexagonAsterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.875f, 6.27f),
                    PathNode.CurveTo(20.575f, 6.668f, 21.005f, 7.413f, 21.0f, 8.218001f),
                    PathNode.LineTo(21.0f, 15.502f),
                    PathNode.CurveTo(21.0f, 16.311f, 20.557f, 17.057f, 19.842f, 17.45f),
                    PathNode.LineTo(13.092f, 21.72f),
                    PathNode.CurveTo(12.411835f, 22.093222f, 11.588165f, 22.093222f, 10.908f, 21.72f),
                    PathNode.LineTo(4.158f, 17.45f),
                    PathNode.CurveTo(3.446241f, 17.059809f, 3.002708f, 16.313692f, 3.0f, 15.502f),
                    PathNode.LineTo(3.0f, 8.217f),
                    PathNode.CurveTo(3.0f, 7.408f, 3.443f, 6.663f, 4.158f, 6.27f),
                    PathNode.LineTo(10.908f, 2.29f),
                    PathNode.CurveTo(11.608304f, 1.903881f, 12.457696f, 1.903881f, 13.158f, 2.29f),
                    PathNode.LineTo(19.908f, 6.27f),
                    PathNode.LineTo(19.875f, 6.27f)
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
                    PathNode.MoveTo(12.0f, 8.5f),
                    PathNode.LineTo(12.0f, 15.5f)
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
                    PathNode.MoveTo(9.0f, 10.0f),
                    PathNode.LineTo(15.0f, 14.0f)
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
                    PathNode.MoveTo(9.0f, 14.0f),
                    PathNode.LineTo(15.0f, 10.0f)
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
        return _hexagonAsterisk!!
    }

private var _hexagonAsterisk: ImageVector? = null
