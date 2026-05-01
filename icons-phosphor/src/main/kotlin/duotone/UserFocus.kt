package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserFocus: ImageVector
    get() {
        if (_userFocus != null) return _userFocus!!
        _userFocus = phosphorDuotoneIcon(
            name = "UserFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 112.0f),
                    PathNode.CurveTo(160.0f, 129.67311f, 145.67311f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(110.32689f, 144.0f, 96.0f, 129.67311f, 96.0f, 112.0f),
                    PathNode.CurveTo(96.0f, 94.32689f, 110.32689f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(145.67311f, 80.0f, 160.0f, 94.32689f, 160.0f, 112.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.LineTo(224.0f, 76.0f),
                    PathNode.CurveTo(224.0f, 80.41828f, 220.41827f, 84.0f, 216.0f, 84.0f),
                    PathNode.CurveTo(211.58173f, 84.0f, 208.0f, 80.41828f, 208.0f, 76.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(180.0f, 48.0f),
                    PathNode.CurveTo(175.58173f, 48.0f, 172.0f, 44.418278f, 172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 35.581722f, 175.58173f, 32.0f, 180.0f, 32.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(220.41827f, 32.0f, 224.0f, 35.581722f, 224.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 172.0f),
                    PathNode.CurveTo(211.58173f, 172.0f, 208.0f, 175.58173f, 208.0f, 180.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.LineTo(180.0f, 208.0f),
                    PathNode.CurveTo(175.58173f, 208.0f, 172.0f, 211.58173f, 172.0f, 216.0f),
                    PathNode.CurveTo(172.0f, 220.41827f, 175.58173f, 224.0f, 180.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.LineTo(224.0f, 180.0f),
                    PathNode.CurveTo(224.0f, 175.58173f, 220.41827f, 172.0f, 216.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 180.0f),
                    PathNode.CurveTo(48.0f, 175.58173f, 44.418278f, 172.0f, 40.0f, 172.0f),
                    PathNode.CurveTo(35.581722f, 172.0f, 32.0f, 175.58173f, 32.0f, 180.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 220.41827f, 35.581722f, 224.0f, 40.0f, 224.0f),
                    PathNode.LineTo(76.0f, 224.0f),
                    PathNode.CurveTo(80.41828f, 224.0f, 84.0f, 220.41827f, 84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 211.58173f, 80.41828f, 208.0f, 76.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 84.0f),
                    PathNode.CurveTo(44.418278f, 84.0f, 48.0f, 80.41828f, 48.0f, 76.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.CurveTo(80.41828f, 48.0f, 84.0f, 44.418278f, 84.0f, 40.0f),
                    PathNode.CurveTo(84.0f, 35.581722f, 80.41828f, 32.0f, 76.0f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(35.581722f, 32.0f, 32.0f, 35.581722f, 32.0f, 40.0f),
                    PathNode.LineTo(32.0f, 76.0f),
                    PathNode.CurveTo(32.0f, 80.41828f, 35.581722f, 84.0f, 40.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 176.0f),
                    PathNode.CurveTo(173.48018f, 176.00551f, 171.10504f, 174.8235f, 169.59f, 172.81f),
                    PathNode.CurveTo(159.76958f, 159.7161f, 144.35738f, 152.01f, 127.99f, 152.01f),
                    PathNode.CurveTo(111.62262f, 152.01f, 96.21043f, 159.7161f, 86.39f, 172.81f),
                    PathNode.CurveTo(83.73351f, 176.34462f, 78.71462f, 177.0565f, 75.18f, 174.4f),
                    PathNode.CurveTo(71.64538f, 171.74352f, 70.93351f, 166.72462f, 73.59f, 163.19f),
                    PathNode.CurveTo(80.6799f, 153.69687f, 90.12919f, 146.22293f, 101.0f, 141.51f),
                    PathNode.CurveTo(88.80736f, 130.37817f, 84.70668f, 112.89904f, 90.67654f, 97.50621f),
                    PathNode.CurveTo(96.64639f, 82.113396f, 111.46007f, 71.96987f, 127.97f, 71.96987f),
                    PathNode.CurveTo(144.47995f, 71.96987f, 159.29361f, 82.113396f, 165.26346f, 97.50621f),
                    PathNode.CurveTo(171.23332f, 112.89904f, 167.13264f, 130.37817f, 154.94f, 141.51f),
                    PathNode.CurveTo(165.8181f, 146.21997f, 175.27457f, 153.69412f, 182.37f, 163.19f),
                    PathNode.CurveTo(184.19083f, 165.60986f, 184.48917f, 168.85045f, 183.14076f, 171.56207f),
                    PathNode.CurveTo(181.79236f, 174.27371f, 179.02838f, 175.9915f, 176.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 136.0f),
                    PathNode.CurveTo(141.25484f, 136.0f, 152.0f, 125.25484f, 152.0f, 112.0f),
                    PathNode.CurveTo(152.0f, 98.74516f, 141.25484f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(114.74516f, 88.0f, 104.0f, 98.74516f, 104.0f, 112.0f),
                    PathNode.CurveTo(104.0f, 125.25484f, 114.74516f, 136.0f, 128.0f, 136.0f),
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
        return _userFocus!!
    }

private var _userFocus: ImageVector? = null
