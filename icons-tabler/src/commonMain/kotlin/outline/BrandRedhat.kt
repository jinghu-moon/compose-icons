package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRedhat: ImageVector
    get() {
        if (_brandRedhat != null) return _brandRedhat!!
        _brandRedhat = tablerOutlineIcon(
            name = "BrandRedhat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 10.5f),
                    PathNode.LineTo(7.436f, 6.5f),
                    PathNode.CurveTo(7.754f, 5.624f, 8.164f, 5.198f, 8.795f, 5.198f),
                    PathNode.CurveTo(9.014f, 5.198f, 9.849f, 5.563f, 10.675f, 5.781f),
                    PathNode.CurveTo(11.5f, 6.0f, 11.408f, 5.452f, 11.583f, 5.294f),
                    PathNode.CurveTo(11.759f, 5.136f, 11.938f, 5.0f, 12.193f, 5.0f),
                    PathNode.CurveTo(12.435f, 5.0f, 12.746f, 5.048f, 13.885f, 5.448f),
                    PathNode.CurveTo(14.644f, 5.715f, 15.378f, 6.022f, 16.089f, 6.37f),
                    PathNode.CurveTo(17.264f, 6.952f, 17.515f, 7.283f, 17.684f, 7.877f),
                    PathNode.LineTo(18.5f, 12.5f),
                    PathNode.CurveTo(20.586f, 13.398f, 22.0f, 14.857f, 22.0f, 16.182f),
                    PathNode.CurveTo(22.0f, 17.867f, 20.8f, 20.0f, 16.043f, 20.0f),
                    PathNode.CurveTo(9.837f, 20.0f, 2.0f, 15.958f, 2.0f, 12.68f),
                    PathNode.CurveTo(2.0f, 11.636f, 3.333f, 10.91f, 6.0f, 10.5f)
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
                    PathNode.MoveTo(6.0f, 10.5f),
                    PathNode.CurveTo(6.0f, 11.469f, 10.39f, 14.0f, 15.5f, 14.0f),
                    PathNode.CurveTo(16.814f, 14.0f, 18.5f, 14.063f, 18.5f, 12.5f)
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
        return _brandRedhat!!
    }

private var _brandRedhat: ImageVector? = null
