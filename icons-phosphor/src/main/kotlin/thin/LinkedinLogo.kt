package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LinkedinLogo: ImageVector
    get() {
        if (_linkedinLogo != null) return _linkedinLogo!!
        _linkedinLogo = phosphorThinIcon(
            name = "LinkedinLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 28.0f),
                    PathNode.LineTo(40.0f, 28.0f),
                    PathNode.CurveTo(33.37258f, 28.0f, 28.0f, 33.37258f, 28.0f, 40.0f),
                    PathNode.LineTo(28.0f, 216.0f),
                    PathNode.CurveTo(28.0f, 222.62741f, 33.37258f, 228.0f, 40.0f, 228.0f),
                    PathNode.LineTo(216.0f, 228.0f),
                    PathNode.CurveTo(222.62741f, 228.0f, 228.0f, 222.62741f, 228.0f, 216.0f),
                    PathNode.LineTo(228.0f, 40.0f),
                    PathNode.CurveTo(228.0f, 33.37258f, 222.62741f, 28.0f, 216.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 218.20914f, 218.20914f, 220.0f, 216.0f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(37.79086f, 220.0f, 36.0f, 218.20914f, 36.0f, 216.0f),
                    PathNode.LineTo(36.0f, 40.0f),
                    PathNode.CurveTo(36.0f, 37.79086f, 37.79086f, 36.0f, 40.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(218.20914f, 36.0f, 220.0f, 37.79086f, 220.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 112.0f),
                    PathNode.LineTo(92.0f, 176.0f),
                    PathNode.CurveTo(92.0f, 178.20914f, 90.20914f, 180.0f, 88.0f, 180.0f),
                    PathNode.CurveTo(85.79086f, 180.0f, 84.0f, 178.20914f, 84.0f, 176.0f),
                    PathNode.LineTo(84.0f, 112.0f),
                    PathNode.CurveTo(84.0f, 109.79086f, 85.79086f, 108.0f, 88.0f, 108.0f),
                    PathNode.CurveTo(90.20914f, 108.0f, 92.0f, 109.79086f, 92.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 140.0f),
                    PathNode.LineTo(180.0f, 176.0f),
                    PathNode.CurveTo(180.0f, 178.20914f, 178.20914f, 180.0f, 176.0f, 180.0f),
                    PathNode.CurveTo(173.79086f, 180.0f, 172.0f, 178.20914f, 172.0f, 176.0f),
                    PathNode.LineTo(172.0f, 140.0f),
                    PathNode.CurveTo(172.0f, 126.74516f, 161.25484f, 116.0f, 148.0f, 116.0f),
                    PathNode.CurveTo(134.74516f, 116.0f, 124.0f, 126.74516f, 124.0f, 140.0f),
                    PathNode.LineTo(124.0f, 176.0f),
                    PathNode.CurveTo(124.0f, 178.20914f, 122.20914f, 180.0f, 120.0f, 180.0f),
                    PathNode.CurveTo(117.79086f, 180.0f, 116.0f, 178.20914f, 116.0f, 176.0f),
                    PathNode.LineTo(116.0f, 112.0f),
                    PathNode.CurveTo(116.0f, 109.79086f, 117.79086f, 108.0f, 120.0f, 108.0f),
                    PathNode.CurveTo(122.20914f, 108.0f, 124.0f, 109.79086f, 124.0f, 112.0f),
                    PathNode.LineTo(124.0f, 118.87f),
                    PathNode.CurveTo(132.79848f, 108.89345f, 146.8513f, 105.40038f, 159.29688f, 110.09637f),
                    PathNode.CurveTo(171.74246f, 114.79235f, 179.98505f, 126.69795f, 180.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 84.0f),
                    PathNode.CurveTo(96.0f, 88.41828f, 92.41828f, 92.0f, 88.0f, 92.0f),
                    PathNode.CurveTo(83.58172f, 92.0f, 80.0f, 88.41828f, 80.0f, 84.0f),
                    PathNode.CurveTo(80.0f, 79.58172f, 83.58172f, 76.0f, 88.0f, 76.0f),
                    PathNode.CurveTo(92.41828f, 76.0f, 96.0f, 79.58172f, 96.0f, 84.0f),
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
        return _linkedinLogo!!
    }

private var _linkedinLogo: ImageVector? = null
