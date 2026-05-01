package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MediumLogo: ImageVector
    get() {
        if (_mediumLogo != null) return _mediumLogo!!
        _mediumLogo = phosphorBoldIcon(
            name = "MediumLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(68.0f, 60.0f),
                    PathNode.CurveTo(30.444637f, 60.0f, 0f, 90.44463f, 0f, 128.0f),
                    PathNode.CurveTo(0f, 165.55536f, 30.444637f, 196.0f, 68.0f, 196.0f),
                    PathNode.CurveTo(105.55537f, 196.0f, 136.0f, 165.55536f, 136.0f, 128.0f),
                    PathNode.CurveTo(135.96141f, 90.46063f, 105.53937f, 60.038586f, 68.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 172.0f),
                    PathNode.CurveTo(43.69947f, 172.0f, 24.0f, 152.30052f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 103.69947f, 43.69947f, 84.0f, 68.0f, 84.0f),
                    PathNode.CurveTo(92.30053f, 84.0f, 112.0f, 103.69947f, 112.0f, 128.0f),
                    PathNode.CurveTo(111.97244f, 152.28911f, 92.28911f, 171.97244f, 68.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 60.0f),
                    PathNode.CurveTo(160.37f, 60.0f, 148.0f, 94.21f, 148.0f, 128.0f),
                    PathNode.CurveTo(148.0f, 161.79f, 160.37f, 196.0f, 184.0f, 196.0f),
                    PathNode.CurveTo(207.63f, 196.0f, 220.0f, 161.79f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 94.21f, 207.63f, 60.0f, 184.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 171.87f),
                    PathNode.CurveTo(180.26f, 169.71f, 172.0f, 154.78f, 172.0f, 128.0f),
                    PathNode.CurveTo(172.0f, 101.22f, 180.26f, 86.29f, 184.0f, 84.13f),
                    PathNode.CurveTo(187.74f, 86.29f, 196.0f, 101.22f, 196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 154.78f, 187.74f, 169.71f, 184.0f, 171.87f),
                    PathNode.Close,
                    PathNode.MoveTo(256.0f, 72.0f),
                    PathNode.LineTo(256.0f, 184.0f),
                    PathNode.CurveTo(256.0f, 190.62741f, 250.62741f, 196.0f, 244.0f, 196.0f),
                    PathNode.CurveTo(237.37259f, 196.0f, 232.0f, 190.62741f, 232.0f, 184.0f),
                    PathNode.LineTo(232.0f, 72.0f),
                    PathNode.CurveTo(232.0f, 65.37258f, 237.37259f, 60.0f, 244.0f, 60.0f),
                    PathNode.CurveTo(250.62741f, 60.0f, 256.0f, 65.37258f, 256.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mediumLogo!!
    }

private var _mediumLogo: ImageVector? = null
