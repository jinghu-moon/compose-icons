package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GenderTransgender: ImageVector
    get() {
        if (_genderTransgender != null) return _genderTransgender!!
        _genderTransgender = phosphorRegularIcon(
            name = "GenderTransgender",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 32.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(163.58173f, 32.0f, 160.0f, 35.581722f, 160.0f, 40.0f),
                    PathNode.CurveTo(160.0f, 44.418278f, 163.58173f, 48.0f, 168.0f, 48.0f),
                    PathNode.LineTo(196.69f, 48.0f),
                    PathNode.LineTo(168.0f, 76.69f),
                    PathNode.LineTo(149.66f, 58.35f),
                    PathNode.CurveTo(146.53683f, 55.224068f, 141.47093f, 55.22183f, 138.345f, 58.345f),
                    PathNode.CurveTo(135.21907f, 61.46817f, 135.21683f, 66.534065f, 138.34f, 69.66f),
                    PathNode.LineTo(156.69f, 88.0f),
                    PathNode.LineTo(140.93f, 103.76f),
                    PathNode.CurveTo(111.091194f, 79.949165f, 67.84976f, 83.5912f, 42.414024f, 112.05756f),
                    PathNode.CurveTo(16.978289f, 140.52391f, 18.206348f, 183.90106f, 45.211887f, 210.88275f),
                    PathNode.CurveTo(72.21742f, 237.86443f, 115.59565f, 239.05415f, 144.03952f, 213.59326f),
                    PathNode.CurveTo(172.48338f, 188.13239f, 176.08719f, 144.88776f, 152.25f, 115.07f),
                    PathNode.LineTo(168.0f, 99.33f),
                    PathNode.LineTo(186.34f, 117.67f),
                    PathNode.CurveTo(189.46317f, 120.79593f, 194.52907f, 120.798164f, 197.655f, 117.675f),
                    PathNode.CurveTo(200.78093f, 114.55183f, 200.78317f, 109.48593f, 197.66f, 106.36f),
                    PathNode.LineTo(179.31f, 88.0f),
                    PathNode.LineTo(208.0f, 59.32f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.CurveTo(208.0f, 92.41828f, 211.58173f, 96.0f, 216.0f, 96.0f),
                    PathNode.CurveTo(220.41827f, 96.0f, 224.0f, 92.41828f, 224.0f, 88.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 35.581722f, 220.41827f, 32.0f, 216.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(135.6f, 199.63f),
                    PathNode.CurveTo(116.71185f, 218.52007f, 87.110985f, 221.43909f, 64.89693f, 206.60223f),
                    PathNode.CurveTo(42.682865f, 191.76538f, 34.04112f, 163.30396f, 44.255703f, 138.62079f),
                    PathNode.CurveTo(54.470287f, 113.93762f, 80.69696f, 99.90572f, 106.89934f, 105.10494f),
                    PathNode.CurveTo(133.10172f, 110.30416f, 151.98376f, 133.28677f, 152.0f, 160.0f),
                    PathNode.CurveTo(152.00024f, 174.86118f, 146.1017f, 189.1148f, 135.6f, 199.63f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _genderTransgender!!
    }

private var _genderTransgender: ImageVector? = null
