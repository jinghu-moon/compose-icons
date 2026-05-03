package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LastfmLogo: ImageVector
    get() {
        if (_lastfmLogo != null) return _lastfmLogo!!
        _lastfmLogo = phosphorThinIcon(
            name = "LastfmLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 160.0f),
                    PathNode.CurveTo(244.0f, 179.88223f, 227.88223f, 196.0f, 208.0f, 196.0f),
                    PathNode.LineTo(190.57f, 196.0f),
                    PathNode.CurveTo(170.38321f, 195.95445f, 152.03293f, 184.27133f, 143.45f, 166.0f),
                    PathNode.LineTo(113.3f, 101.4f),
                    PathNode.CurveTo(106.04032f, 85.93545f, 90.51372f, 76.04391f, 73.43f, 76.0f),
                    PathNode.LineTo(64.0f, 76.0f),
                    PathNode.CurveTo(39.71089f, 76.02756f, 20.027554f, 95.71089f, 20.0f, 120.0f),
                    PathNode.LineTo(20.0f, 144.0f),
                    PathNode.CurveTo(20.027554f, 168.28911f, 39.71089f, 187.97244f, 64.0f, 188.0f),
                    PathNode.LineTo(72.0f, 188.0f),
                    PathNode.CurveTo(86.316376f, 188.00217f, 99.273445f, 179.52118f, 105.0f, 166.4f),
                    PathNode.CurveTo(105.550735f, 165.05856f, 106.78433f, 164.12025f, 108.22411f, 163.94763f),
                    PathNode.CurveTo(109.66389f, 163.77501f, 111.084335f, 164.39513f, 111.93656f, 165.56836f),
                    PathNode.CurveTo(112.788795f, 166.74158f, 112.93933f, 168.28415f, 112.33f, 169.6f),
                    PathNode.CurveTo(105.33137f, 185.63588f, 89.49658f, 196.00133f, 72.0f, 196.0f),
                    PathNode.LineTo(64.0f, 196.0f),
                    PathNode.CurveTo(35.2949f, 195.96693f, 12.033064f, 172.7051f, 12.0f, 144.0f),
                    PathNode.LineTo(12.0f, 120.0f),
                    PathNode.CurveTo(12.033064f, 91.2949f, 35.2949f, 68.033066f, 64.0f, 68.0f),
                    PathNode.LineTo(73.43f, 68.0f),
                    PathNode.CurveTo(93.61678f, 68.04555f, 111.96707f, 79.72867f, 120.55f, 98.0f),
                    PathNode.LineTo(150.7f, 162.6f),
                    PathNode.CurveTo(157.95967f, 178.06454f, 173.48628f, 187.9561f, 190.57f, 188.0f),
                    PathNode.LineTo(208.0f, 188.0f),
                    PathNode.CurveTo(223.46397f, 188.0f, 236.0f, 175.46397f, 236.0f, 160.0f),
                    PathNode.CurveTo(236.0f, 144.53603f, 223.46397f, 132.0f, 208.0f, 132.0f),
                    PathNode.LineTo(188.0f, 132.0f),
                    PathNode.CurveTo(170.32689f, 132.0f, 156.0f, 117.67311f, 156.0f, 100.0f),
                    PathNode.CurveTo(156.0f, 82.32689f, 170.32689f, 68.0f, 188.0f, 68.0f),
                    PathNode.LineTo(208.0f, 68.0f),
                    PathNode.CurveTo(223.46397f, 68.0f, 236.0f, 80.536026f, 236.0f, 96.0f),
                    PathNode.CurveTo(236.0f, 98.20914f, 234.20914f, 100.0f, 232.0f, 100.0f),
                    PathNode.CurveTo(229.79086f, 100.0f, 228.0f, 98.20914f, 228.0f, 96.0f),
                    PathNode.CurveTo(228.0f, 84.95431f, 219.0457f, 76.0f, 208.0f, 76.0f),
                    PathNode.LineTo(188.0f, 76.0f),
                    PathNode.CurveTo(174.74516f, 76.0f, 164.0f, 86.74516f, 164.0f, 100.0f),
                    PathNode.CurveTo(164.0f, 113.25484f, 174.74516f, 124.0f, 188.0f, 124.0f),
                    PathNode.LineTo(208.0f, 124.0f),
                    PathNode.CurveTo(227.88223f, 124.0f, 244.0f, 140.11777f, 244.0f, 160.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lastfmLogo!!
    }

private var _lastfmLogo: ImageVector? = null
