package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWebflow: ImageVector
    get() {
        if (_brandWebflow != null) return _brandWebflow!!
        _brandWebflow = tablerOutlineIcon(
            name = "BrandWebflow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.CurveTo(17.0f, 10.0f, 15.624f, 13.606f, 15.5f, 14.0f),
                    PathNode.CurveTo(15.454f, 13.6f, 14.0f, 6.0f, 14.0f, 6.0f),
                    PathNode.CurveTo(11.373f, 6.0f, 10.234f, 7.562f, 9.5f, 9.5f),
                    PathNode.CurveTo(9.5f, 9.5f, 7.657f, 14.093f, 7.5f, 14.5f),
                    PathNode.CurveTo(7.487f, 14.132f, 7.0f, 10.0f, 7.0f, 10.0f),
                    PathNode.CurveTo(6.85f, 7.629f, 4.789f, 6.02f, 3.0f, 6.02f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(7.745f, 18.987f, 9.72f, 17.438f, 10.5f, 15.5f),
                    PathNode.CurveTo(10.5f, 15.5f, 11.94f, 11.2f, 12.0f, 11.0f),
                    PathNode.CurveTo(12.013f, 11.18f, 13.0f, 19.0f, 13.0f, 19.0f),
                    PathNode.CurveTo(15.758f, 19.0f, 17.694f, 17.374f, 18.5f, 15.5f),
                    PathNode.LineTo(22.0f, 6.0f),
                    PathNode.CurveTo(19.268f, 6.0f, 17.747f, 8.055001f, 17.0f, 10.0f)
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
        return _brandWebflow!!
    }

private var _brandWebflow: ImageVector? = null
