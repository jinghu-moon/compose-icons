package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HexagonLetterW: ImageVector
    get() {
        if (_hexagonLetterW != null) return _hexagonLetterW!!
        _hexagonLetterW = tablerOutlineIcon(
            name = "HexagonLetterW",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.875f, 6.27f),
                    PathNode.CurveTo(20.5748f, 6.66799f, 21.005032f, 7.412958f, 21.0f, 8.218001f),
                    PathNode.LineTo(21.0f, 15.502f),
                    PathNode.CurveTo(21.0f, 16.311f, 20.557f, 17.057f, 19.842f, 17.45f),
                    PathNode.LineTo(13.092f, 21.72f),
                    PathNode.CurveTo(12.411882f, 22.093409f, 11.588118f, 22.093409f, 10.908f, 21.72f),
                    PathNode.LineTo(4.158f, 17.45f),
                    PathNode.CurveTo(3.445466f, 17.060612f, 3.001632f, 16.31399f, 3.0f, 15.502f),
                    PathNode.LineTo(3.0f, 8.217f),
                    PathNode.CurveTo(3.0f, 7.408f, 3.443f, 6.663f, 4.158f, 6.27f),
                    PathNode.LineTo(10.908f, 2.29f),
                    PathNode.CurveTo(11.608304f, 1.903881f, 12.457696f, 1.903881f, 13.158f, 2.29f),
                    PathNode.LineTo(19.908f, 6.27f),
                    PathNode.LineTo(19.875f, 6.27f)
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
                    PathNode.MoveTo(9.0f, 8.0f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.LineTo(12.0f, 11.0f),
                    PathNode.LineTo(14.0f, 16.0f),
                    PathNode.LineTo(15.0f, 8.0f)
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
        return _hexagonLetterW!!
    }

private var _hexagonLetterW: ImageVector? = null
