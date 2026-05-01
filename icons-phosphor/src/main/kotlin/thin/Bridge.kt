package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorThinIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 164.0f),
                    PathNode.LineTo(196.0f, 164.0f),
                    PathNode.LineTo(196.0f, 88.09f),
                    PathNode.CurveTo(203.49869f, 102.157326f, 215.71367f, 113.13312f, 230.5f, 119.09f),
                    PathNode.CurveTo(232.54898f, 119.91843f, 234.88158f, 118.92898f, 235.71f, 116.88f),
                    PathNode.CurveTo(236.53842f, 114.831024f, 235.54898f, 112.49843f, 233.5f, 111.67f),
                    PathNode.CurveTo(210.77675f, 102.546646f, 195.91656f, 80.48622f, 196.0f, 56.0f),
                    PathNode.CurveTo(196.0f, 53.79086f, 194.20914f, 52.0f, 192.0f, 52.0f),
                    PathNode.CurveTo(189.79086f, 52.0f, 188.0f, 53.79086f, 188.0f, 56.0f),
                    PathNode.CurveTo(188.0f, 89.137085f, 161.13708f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(94.862915f, 116.0f, 68.0f, 89.137085f, 68.0f, 56.0f),
                    PathNode.CurveTo(68.0f, 53.79086f, 66.20914f, 52.0f, 64.0f, 52.0f),
                    PathNode.CurveTo(61.79086f, 52.0f, 60.0f, 53.79086f, 60.0f, 56.0f),
                    PathNode.CurveTo(60.071125f, 80.47529f, 45.213062f, 102.5207f, 22.5f, 111.64f),
                    PathNode.CurveTo(20.451023f, 112.46843f, 19.461573f, 114.801025f, 20.29f, 116.85f),
                    PathNode.CurveTo(21.118427f, 118.89898f, 23.451023f, 119.88843f, 25.5f, 119.06f),
                    PathNode.CurveTo(40.286327f, 113.10312f, 52.50132f, 102.12733f, 60.0f, 88.06f),
                    PathNode.LineTo(60.0f, 164.0f),
                    PathNode.LineTo(24.0f, 164.0f),
                    PathNode.CurveTo(21.790861f, 164.0f, 20.0f, 165.79086f, 20.0f, 168.0f),
                    PathNode.CurveTo(20.0f, 170.20914f, 21.790861f, 172.0f, 24.0f, 172.0f),
                    PathNode.LineTo(60.0f, 172.0f),
                    PathNode.LineTo(60.0f, 200.0f),
                    PathNode.CurveTo(60.0f, 202.20914f, 61.79086f, 204.0f, 64.0f, 204.0f),
                    PathNode.CurveTo(66.20914f, 204.0f, 68.0f, 202.20914f, 68.0f, 200.0f),
                    PathNode.LineTo(68.0f, 172.0f),
                    PathNode.LineTo(188.0f, 172.0f),
                    PathNode.LineTo(188.0f, 200.0f),
                    PathNode.CurveTo(188.0f, 202.20914f, 189.79086f, 204.0f, 192.0f, 204.0f),
                    PathNode.CurveTo(194.20914f, 204.0f, 196.0f, 202.20914f, 196.0f, 200.0f),
                    PathNode.LineTo(196.0f, 172.0f),
                    PathNode.LineTo(232.0f, 172.0f),
                    PathNode.CurveTo(234.20914f, 172.0f, 236.0f, 170.20914f, 236.0f, 168.0f),
                    PathNode.CurveTo(236.0f, 165.79086f, 234.20914f, 164.0f, 232.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 121.0f),
                    PathNode.LineTo(148.0f, 164.0f),
                    PathNode.LineTo(108.0f, 164.0f),
                    PathNode.LineTo(108.0f, 121.0f),
                    PathNode.CurveTo(121.03179f, 125.010254f, 134.9682f, 125.010254f, 148.0f, 121.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 88.0f),
                    PathNode.CurveTo(75.0859f, 101.24037f, 86.33048f, 111.782166f, 100.0f, 118.0f),
                    PathNode.LineTo(100.0f, 164.0f),
                    PathNode.LineTo(68.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 164.0f),
                    PathNode.LineTo(156.0f, 118.0f),
                    PathNode.CurveTo(169.66951f, 111.782166f, 180.91411f, 101.24037f, 188.0f, 88.0f),
                    PathNode.LineTo(188.0f, 164.0f),
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
        return _bridge!!
    }

private var _bridge: ImageVector? = null
