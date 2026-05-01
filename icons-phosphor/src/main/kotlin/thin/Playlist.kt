package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = phosphorThinIcon(
            name = "Playlist",
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
                    PathNode.LineTo(160.0f, 132.0f),
                    PathNode.CurveTo(162.20914f, 132.0f, 164.0f, 130.20914f, 164.0f, 128.0f),
                    PathNode.CurveTo(164.0f, 125.79086f, 162.20914f, 124.0f, 160.0f, 124.0f),
                    PathNode.LineTo(40.0f, 124.0f),
                    PathNode.CurveTo(37.79086f, 124.0f, 36.0f, 125.79086f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 130.20914f, 37.79086f, 132.0f, 40.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 188.0f),
                    PathNode.LineTo(40.0f, 188.0f),
                    PathNode.CurveTo(37.79086f, 188.0f, 36.0f, 189.79086f, 36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 194.20914f, 37.79086f, 196.0f, 40.0f, 196.0f),
                    PathNode.LineTo(112.0f, 196.0f),
                    PathNode.CurveTo(114.20914f, 196.0f, 116.0f, 194.20914f, 116.0f, 192.0f),
                    PathNode.CurveTo(116.0f, 189.79086f, 114.20914f, 188.0f, 112.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(243.83f, 125.15f),
                    PathNode.CurveTo(243.52498f, 126.1702f, 242.82579f, 127.02667f, 241.88728f, 127.52971f),
                    PathNode.CurveTo(240.94879f, 128.03275f, 239.84843f, 128.14082f, 238.83f, 127.83f),
                    PathNode.LineTo(204.0f, 117.38f),
                    PathNode.LineTo(204.0f, 192.0f),
                    PathNode.CurveTo(204.0124f, 205.38737f, 194.54652f, 216.91064f, 181.41154f, 219.49802f),
                    PathNode.CurveTo(168.27658f, 222.08537f, 155.14766f, 215.01291f, 150.08195f, 202.62094f),
                    PathNode.CurveTo(145.01625f, 190.22899f, 149.43117f, 175.98479f, 160.61725f, 168.62997f),
                    PathNode.CurveTo(171.80334f, 161.27516f, 186.63078f, 162.86758f, 196.0f, 172.43f),
                    PathNode.LineTo(196.0f, 112.0f),
                    PathNode.CurveTo(196.00035f, 110.735664f, 196.59845f, 109.54592f, 197.61298f, 108.79143f),
                    PathNode.CurveTo(198.62752f, 108.03693f, 199.93904f, 107.8065f, 201.15f, 108.17f),
                    PathNode.LineTo(241.15f, 120.17f),
                    PathNode.CurveTo(243.26485f, 120.805626f, 244.4645f, 123.03481f, 243.83f, 125.15f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 192.0f),
                    PathNode.CurveTo(196.0f, 180.9543f, 187.0457f, 172.0f, 176.0f, 172.0f),
                    PathNode.CurveTo(164.9543f, 172.0f, 156.0f, 180.9543f, 156.0f, 192.0f),
                    PathNode.CurveTo(156.0f, 203.0457f, 164.9543f, 212.0f, 176.0f, 212.0f),
                    PathNode.CurveTo(187.0457f, 212.0f, 196.0f, 203.0457f, 196.0f, 192.0f),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
