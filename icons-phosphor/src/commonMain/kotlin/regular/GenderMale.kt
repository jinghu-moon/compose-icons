package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GenderMale: ImageVector
    get() {
        if (_genderMale != null) return _genderMale!!
        _genderMale = phosphorRegularIcon(
            name = "GenderMale",
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
                    PathNode.LineTo(154.62f, 90.07f),
                    PathNode.CurveTo(121.61629f, 63.092617f, 73.25642f, 66.73133f, 44.66112f, 98.34357f),
                    PathNode.CurveTo(16.065828f, 129.95581f, 17.279745f, 178.43718f, 47.421284f, 208.57872f),
                    PathNode.CurveTo(77.56282f, 238.72026f, 126.0442f, 239.93417f, 157.65643f, 211.33888f),
                    PathNode.CurveTo(189.26868f, 182.74359f, 192.90738f, 134.38371f, 165.93f, 101.38f),
                    PathNode.LineTo(208.0f, 59.32f),
                    PathNode.LineTo(208.0f, 88.0f),
                    PathNode.CurveTo(208.0f, 92.41828f, 211.58173f, 96.0f, 216.0f, 96.0f),
                    PathNode.CurveTo(220.41827f, 96.0f, 224.0f, 92.41828f, 224.0f, 88.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 35.581722f, 220.41827f, 32.0f, 216.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.24f, 197.29f),
                    PathNode.CurveTo(124.24348f, 222.2753f, 83.72615f, 222.26923f, 58.73711f, 197.27644f),
                    PathNode.CurveTo(33.748074f, 172.28366f, 33.748074f, 131.76633f, 58.73711f, 106.77355f),
                    PathNode.CurveTo(83.72615f, 81.78078f, 124.24348f, 81.774704f, 149.24f, 106.76f),
                    PathNode.CurveTo(174.19199f, 131.77869f, 174.19199f, 172.2713f, 149.24f, 197.29f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
