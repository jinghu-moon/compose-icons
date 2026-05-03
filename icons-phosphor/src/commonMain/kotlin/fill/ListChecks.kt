package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ListChecks: ImageVector
    get() {
        if (_listChecks != null) return _listChecks!!
        _listChecks = phosphorFillIcon(
            name = "ListChecks",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(117.66f, 149.66f),
                    PathNode.LineTo(85.66f, 181.66f),
                    PathNode.CurveTo(84.159454f, 183.16223f, 82.123276f, 184.00629f, 80.0f, 184.00629f),
                    PathNode.CurveTo(77.876724f, 184.00629f, 75.840546f, 183.16223f, 74.34f, 181.66f),
                    PathNode.LineTo(58.34f, 165.66f),
                    PathNode.CurveTo(55.21407f, 162.53407f, 55.21407f, 157.46593f, 58.34f, 154.34f),
                    PathNode.CurveTo(61.46593f, 151.21407f, 66.534065f, 151.21407f, 69.66f, 154.34f),
                    PathNode.LineTo(80.0f, 164.69f),
                    PathNode.LineTo(106.34f, 138.34f),
                    PathNode.CurveTo(109.465935f, 135.21407f, 114.534065f, 135.21407f, 117.66f, 138.34f),
                    PathNode.CurveTo(120.785934f, 141.46593f, 120.785934f, 146.53407f, 117.66f, 149.66f),
                    PathNode.Close,
                    PathNode.MoveTo(117.66f, 85.66f),
                    PathNode.LineTo(85.66f, 117.66f),
                    PathNode.CurveTo(84.159454f, 119.16222f, 82.123276f, 120.006294f, 80.0f, 120.006294f),
                    PathNode.CurveTo(77.876724f, 120.006294f, 75.840546f, 119.16222f, 74.34f, 117.66f),
                    PathNode.LineTo(58.34f, 101.66f),
                    PathNode.CurveTo(55.21407f, 98.534065f, 55.21407f, 93.465935f, 58.34f, 90.34f),
                    PathNode.CurveTo(61.46593f, 87.214066f, 66.534065f, 87.214066f, 69.66f, 90.34f),
                    PathNode.LineTo(80.0f, 100.69f),
                    PathNode.LineTo(106.34f, 74.34f),
                    PathNode.CurveTo(109.465935f, 71.214066f, 114.534065f, 71.214066f, 117.66f, 74.34f),
                    PathNode.CurveTo(120.785934f, 77.465935f, 120.785934f, 82.534065f, 117.66f, 85.66f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 168.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.CurveTo(139.58173f, 168.0f, 136.0f, 164.41827f, 136.0f, 160.0f),
                    PathNode.CurveTo(136.0f, 155.58173f, 139.58173f, 152.0f, 144.0f, 152.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.CurveTo(196.41827f, 152.0f, 200.0f, 155.58173f, 200.0f, 160.0f),
                    PathNode.CurveTo(200.0f, 164.41827f, 196.41827f, 168.0f, 192.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 104.0f),
                    PathNode.LineTo(144.0f, 104.0f),
                    PathNode.CurveTo(139.58173f, 104.0f, 136.0f, 100.41828f, 136.0f, 96.0f),
                    PathNode.CurveTo(136.0f, 91.58172f, 139.58173f, 88.0f, 144.0f, 88.0f),
                    PathNode.LineTo(192.0f, 88.0f),
                    PathNode.CurveTo(196.41827f, 88.0f, 200.0f, 91.58172f, 200.0f, 96.0f),
                    PathNode.CurveTo(200.0f, 100.41828f, 196.41827f, 104.0f, 192.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _listChecks!!
    }

private var _listChecks: ImageVector? = null
