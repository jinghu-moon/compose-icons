package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeAr: ImageVector
    get() {
        if (_badgeAr != null) return _badgeAr!!
        _badgeAr = tablerFilledIcon(
            name = "BadgeAr",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 4.0f),
                    PathNode.CurveTo(20.656855f, 4.0f, 22.0f, 5.343146f, 22.0f, 7.0f),
                    PathNode.LineTo(22.0f, 17.0f),
                    PathNode.CurveTo(22.0f, 18.656855f, 20.656855f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.343146f, 20.0f, 2.0f, 18.656855f, 2.0f, 17.0f),
                    PathNode.LineTo(2.0f, 7.0f),
                    PathNode.CurveTo(2.0f, 5.343146f, 3.343146f, 4.0f, 5.0f, 4.0f),
                    PathNode.Close,
                    PathNode.MoveTo(8.5f, 8.0f),
                    PathNode.CurveTo(7.119288f, 8.0f, 6.0f, 9.119288f, 6.0f, 10.5f),
                    PathNode.LineTo(6.0f, 15.0f),
                    PathNode.CurveTo(6.0f, 15.552285f, 6.447716f, 16.0f, 7.0f, 16.0f),
                    PathNode.CurveTo(7.552285f, 16.0f, 8.0f, 15.552285f, 8.0f, 15.0f),
                    PathNode.LineTo(8.0f, 14.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.LineTo(9.0f, 15.0f),
                    PathNode.CurveTo(9.000067f, 15.506975f, 9.379507f, 15.933684f, 9.883f, 15.993f),
                    PathNode.LineTo(10.0f, 16.0f),
                    PathNode.CurveTo(10.552285f, 16.0f, 11.0f, 15.552285f, 11.0f, 15.0f),
                    PathNode.LineTo(11.0f, 10.5f),
                    PathNode.CurveTo(11.0f, 9.119288f, 9.880712f, 8.0f, 8.5f, 8.0f),
                    PathNode.MoveTo(15.5f, 8.0f),
                    PathNode.LineTo(14.0f, 8.0f),
                    PathNode.CurveTo(13.447715f, 8.0f, 13.0f, 8.447715f, 13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.CurveTo(13.0f, 15.552285f, 13.447715f, 16.0f, 14.0f, 16.0f),
                    PathNode.LineTo(14.117f, 15.993f),
                    PathNode.CurveTo(14.620493f, 15.933684f, 14.999933f, 15.506975f, 15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 13.804f),
                    PathNode.LineTo(16.168f, 15.554f),
                    PathNode.CurveTo(16.315016f, 15.774849f, 16.54377f, 15.928225f, 16.803904f, 15.980364f),
                    PathNode.CurveTo(17.064037f, 16.032503f, 17.334229f, 15.979133f, 17.555f, 15.832f),
                    PathNode.LineTo(17.648f, 15.762f),
                    PathNode.CurveTo(18.03462f, 15.433282f, 18.113724f, 14.867094f, 17.832f, 14.445f),
                    PathNode.LineTo(16.673f, 12.707f),
                    PathNode.LineTo(16.717f, 12.684f),
                    PathNode.CurveTo(17.71179f, 12.129846f, 18.206408f, 10.973454f, 17.92005f, 9.871322f),
                    PathNode.CurveTo(17.633694f, 8.769189f, 16.638725f, 7.999823f, 15.5f, 8.0f),
                    PathNode.MoveTo(8.5f, 10.0f),
                    PathNode.CurveTo(8.776142f, 10.0f, 9.0f, 10.223858f, 9.0f, 10.5f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(8.0f, 12.0f),
                    PathNode.LineTo(8.0f, 10.5f),
                    PathNode.CurveTo(7.99992f, 10.258508f, 8.172452f, 10.051469f, 8.41f, 10.008f),
                    PathNode.Close,
                    PathNode.MoveTo(15.5f, 10.0f),
                    PathNode.CurveTo(15.776142f, 10.0f, 16.0f, 10.223858f, 16.0f, 10.5f),
                    PathNode.CurveTo(16.0f, 10.776142f, 15.776142f, 11.0f, 15.5f, 11.0f),
                    PathNode.LineTo(15.0f, 11.0f),
                    PathNode.LineTo(15.0f, 10.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _badgeAr!!
    }

private var _badgeAr: ImageVector? = null
