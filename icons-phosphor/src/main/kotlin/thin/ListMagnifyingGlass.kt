package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ListMagnifyingGlass: ImageVector
    get() {
        if (_listMagnifyingGlass != null) return _listMagnifyingGlass!!
        _listMagnifyingGlass = phosphorThinIcon(
            name = "ListMagnifyingGlass",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.CurveTo(218.20914f, 60.0f, 220.0f, 61.79086f, 220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 66.20914f, 218.20914f, 68.0f, 216.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(37.79086f, 68.0f, 36.0f, 66.20914f, 36.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 132.0f),
                    PathNode.LineTo(112.0f, 132.0f),
                    PathNode.CurveTo(114.20914f, 132.0f, 116.0f, 130.20914f, 116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 125.79086f, 114.20914f, 124.0f, 112.0f, 124.0f),
                    PathNode.LineTo(40.0f, 124.0f),
                    PathNode.CurveTo(37.79086f, 124.0f, 36.0f, 125.79086f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 130.20914f, 37.79086f, 132.0f, 40.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 188.0f),
                    PathNode.LineTo(40.0f, 188.0f),
                    PathNode.CurveTo(37.79086f, 188.0f, 36.0f, 189.79086f, 36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 194.20914f, 37.79086f, 196.0f, 40.0f, 196.0f),
                    PathNode.LineTo(128.0f, 196.0f),
                    PathNode.CurveTo(130.20914f, 196.0f, 132.0f, 194.20914f, 132.0f, 192.0f),
                    PathNode.CurveTo(132.0f, 189.79086f, 130.20914f, 188.0f, 128.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(234.83f, 194.83f),
                    PathNode.CurveTo(234.07973f, 195.58112f, 233.06163f, 196.00314f, 232.0f, 196.00314f),
                    PathNode.CurveTo(230.93837f, 196.00314f, 229.92027f, 195.58112f, 229.17f, 194.83f),
                    PathNode.LineTo(206.45f, 172.11f),
                    PathNode.CurveTo(191.50003f, 184.05624f, 169.82191f, 182.2438f, 157.06322f, 167.98093f),
                    PathNode.CurveTo(144.3045f, 153.71805f, 144.90929f, 131.9727f, 158.441f, 118.440994f),
                    PathNode.CurveTo(171.9727f, 104.90929f, 193.71805f, 104.30452f, 207.98093f, 117.06322f),
                    PathNode.CurveTo(222.2438f, 129.82191f, 224.05624f, 151.50003f, 212.11f, 166.45f),
                    PathNode.LineTo(234.83f, 189.17f),
                    PathNode.CurveTo(235.58112f, 189.92027f, 236.00314f, 190.93837f, 236.00314f, 192.0f),
                    PathNode.CurveTo(236.00314f, 193.06163f, 235.58112f, 194.07973f, 234.83f, 194.83f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 172.0f),
                    PathNode.CurveTo(199.46397f, 172.0f, 212.0f, 159.46397f, 212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 128.53603f, 199.46397f, 116.0f, 184.0f, 116.0f),
                    PathNode.CurveTo(168.53603f, 116.0f, 156.0f, 128.53603f, 156.0f, 144.0f),
                    PathNode.CurveTo(156.0f, 159.46397f, 168.53603f, 172.0f, 184.0f, 172.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _listMagnifyingGlass!!
    }

private var _listMagnifyingGlass: ImageVector? = null
