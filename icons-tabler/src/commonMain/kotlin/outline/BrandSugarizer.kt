package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSugarizer: ImageVector
    get() {
        if (_brandSugarizer != null) return _brandSugarizer!!
        _brandSugarizer = tablerOutlineIcon(
            name = "BrandSugarizer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.277f, 16.0f),
                    PathNode.LineTo(17.529f, 12.748f),
                    PathNode.CurveTo(18.137959f, 12.11598f, 18.128529f, 11.112675f, 17.507795f, 10.492214f),
                    PathNode.CurveTo(16.887062f, 9.871754f, 15.883752f, 9.862763f, 15.252f, 10.472f),
                    PathNode.LineTo(12.0f, 13.723f),
                    PathNode.LineTo(8.748f, 10.472f),
                    PathNode.CurveTo(8.114675f, 9.873021f, 7.119667f, 9.886884f, 6.503276f, 10.503276f),
                    PathNode.CurveTo(5.886884f, 11.119667f, 5.873021f, 12.114675f, 6.472f, 12.748f),
                    PathNode.LineTo(9.723f, 16.0f),
                    PathNode.LineTo(6.472f, 19.252f),
                    PathNode.CurveTo(6.052713f, 19.655989f, 5.884216f, 20.254877f, 6.031343f, 20.818228f),
                    PathNode.CurveTo(6.17847f, 21.381577f, 6.618295f, 21.821594f, 7.181579f, 21.96897f),
                    PathNode.CurveTo(7.744863f, 22.116344f, 8.343827f, 21.948109f, 8.748f, 21.529f),
                    PathNode.LineTo(12.0f, 18.277f),
                    PathNode.LineTo(15.252f, 21.529f),
                    PathNode.CurveTo(15.880776f, 22.157776f, 16.900225f, 22.157776f, 17.529f, 21.529f),
                    PathNode.CurveTo(18.157776f, 20.900225f, 18.157776f, 19.880775f, 17.529f, 19.252f),
                    PathNode.LineTo(14.277f, 16.0f)
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
                    PathNode.MoveTo(9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 6.656854f, 10.343145f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(13.656855f, 8.0f, 15.0f, 6.656854f, 15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 3.343146f, 13.656855f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(10.343145f, 2.0f, 9.0f, 3.343146f, 9.0f, 5.0f)
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
        return _brandSugarizer!!
    }

private var _brandSugarizer: ImageVector? = null
