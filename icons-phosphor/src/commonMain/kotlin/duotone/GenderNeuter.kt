package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.GenderNeuter: ImageVector
    get() {
        if (_genderNeuter != null) return _genderNeuter!!
        _genderNeuter = phosphorDuotoneIcon(
            name = "GenderNeuter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 143.7645f, 167.7645f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(88.2355f, 176.0f, 56.0f, 143.7645f, 56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 64.2355f, 88.2355f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(167.7645f, 32.0f, 200.0f, 64.2355f, 200.0f, 104.0f),
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
                    PathNode.MoveTo(208.0f, 104.0f),
                    PathNode.CurveTo(207.99945f, 60.856922f, 173.78902f, 25.485453f, 130.66997f, 24.045572f),
                    PathNode.CurveTo(87.55092f, 22.60569f, 51.056984f, 55.616116f, 48.178284f, 98.66305f),
                    PathNode.CurveTo(45.299583f, 141.70999f, 77.07318f, 179.28569f, 120.0f, 183.6f),
                    PathNode.LineTo(120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 236.41827f, 123.58172f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.LineTo(136.0f, 183.6f),
                    PathNode.CurveTo(176.85463f, 179.44272f, 207.94954f, 145.06557f, 208.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 168.0f),
                    PathNode.CurveTo(92.65378f, 168.0f, 64.0f, 139.34622f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 68.65378f, 92.65378f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(163.34622f, 40.0f, 192.0f, 68.65378f, 192.0f, 104.0f),
                    PathNode.CurveTo(191.96143f, 139.33023f, 163.33023f, 167.96143f, 128.0f, 168.0f),
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
        return _genderNeuter!!
    }

private var _genderNeuter: ImageVector? = null
