package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPeanut: ImageVector
    get() {
        if (_brandPeanut != null) return _brandPeanut!!
        _brandPeanut = tablerOutlineIcon(
            name = "BrandPeanut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 16.25f),
                    PathNode.LineTo(14.184f, 15.89f),
                    PathNode.LineTo(13.722f, 15.694f),
                    PathNode.CurveTo(12.278f, 15.102f, 11.722f, 15.101f, 10.275f, 15.694f),
                    PathNode.LineTo(9.813f, 15.889f),
                    PathNode.LineTo(8.996f, 16.248f),
                    PathNode.CurveTo(7.131786f, 16.903795f, 5.057868f, 16.26659f, 3.88348f, 14.677196f),
                    PathNode.CurveTo(2.709093f, 13.0878f, 2.709093f, 10.9182f, 3.88348f, 9.328805f),
                    PathNode.CurveTo(5.057868f, 7.73941f, 7.131786f, 7.102205f, 8.996f, 7.758f),
                    PathNode.LineTo(10.05f, 8.220001f),
                    PathNode.LineTo(10.484f, 8.398f),
                    PathNode.CurveTo(11.776f, 8.905f, 12.347f, 8.878f, 13.721f, 8.316f),
                    PathNode.LineTo(14.183f, 8.121001f),
                    PathNode.LineTo(15.0f, 7.762f),
                    PathNode.CurveTo(16.864214f, 7.106205f, 18.938133f, 7.74341f, 20.11252f, 9.332805f),
                    PathNode.CurveTo(21.286907f, 10.922199f, 21.286907f, 13.091801f, 20.11252f, 14.681195f),
                    PathNode.CurveTo(18.938133f, 16.27059f, 16.864214f, 16.907795f, 15.0f, 16.252f)
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
        return _brandPeanut!!
    }

private var _brandPeanut: ImageVector? = null
