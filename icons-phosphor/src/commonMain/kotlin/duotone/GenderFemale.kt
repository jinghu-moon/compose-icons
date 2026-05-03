package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) return _genderFemale!!
        _genderFemale = phosphorDuotoneIcon(
            name = "GenderFemale",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 96.0f),
                    PathNode.CurveTo(200.0f, 135.7645f, 167.7645f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(88.2355f, 168.0f, 56.0f, 135.7645f, 56.0f, 96.0f),
                    PathNode.CurveTo(56.0f, 56.235497f, 88.2355f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(167.7645f, 24.0f, 200.0f, 56.235497f, 200.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.CurveTo(207.99945f, 52.856922f, 173.78902f, 17.485453f, 130.66997f, 16.045572f),
                    PathNode.CurveTo(87.55092f, 14.60569f, 51.056984f, 47.616116f, 48.178284f, 90.66305f),
                    PathNode.CurveTo(45.299583f, 133.70998f, 77.07318f, 171.28569f, 120.0f, 175.6f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(88.0f, 200.0f),
                    PathNode.CurveTo(83.58172f, 200.0f, 80.0f, 203.58173f, 80.0f, 208.0f),
                    PathNode.CurveTo(80.0f, 212.41827f, 83.58172f, 216.0f, 88.0f, 216.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.LineTo(120.0f, 240.0f),
                    PathNode.CurveTo(120.0f, 244.41827f, 123.58172f, 248.0f, 128.0f, 248.0f),
                    PathNode.CurveTo(132.41827f, 248.0f, 136.0f, 244.41827f, 136.0f, 240.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.LineTo(168.0f, 216.0f),
                    PathNode.CurveTo(172.41827f, 216.0f, 176.0f, 212.41827f, 176.0f, 208.0f),
                    PathNode.CurveTo(176.0f, 203.58173f, 172.41827f, 200.0f, 168.0f, 200.0f),
                    PathNode.LineTo(136.0f, 200.0f),
                    PathNode.LineTo(136.0f, 175.6f),
                    PathNode.CurveTo(176.85463f, 171.44272f, 207.94954f, 137.06557f, 208.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 96.0f),
                    PathNode.CurveTo(64.0f, 60.653774f, 92.65378f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(163.34622f, 32.0f, 192.0f, 60.653774f, 192.0f, 96.0f),
                    PathNode.CurveTo(192.0f, 131.34622f, 163.34622f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(92.66977f, 159.96143f, 64.03858f, 131.33023f, 64.0f, 96.0f),
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
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
