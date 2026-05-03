package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Subtract: ImageVector
    get() {
        if (_subtract != null) return _subtract!!
        _subtract = phosphorDuotoneIcon(
            name = "Subtract",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 160.0f),
                    PathNode.CurveTo(232.01123f, 198.29393f, 202.04567f, 229.89662f, 163.80527f, 231.92049f),
                    PathNode.CurveTo(125.56485f, 233.94435f, 92.43091f, 205.68118f, 88.4f, 167.6f),
                    PathNode.LineTo(88.4f, 167.6f),
                    PathNode.CurveTo(90.924706f, 167.86472f, 93.46146f, 167.99823f, 96.0f, 168.0f),
                    PathNode.CurveTo(135.7645f, 168.0f, 168.0f, 135.7645f, 168.0f, 96.0f),
                    PathNode.CurveTo(167.99823f, 93.46146f, 167.86472f, 90.924706f, 167.6f, 88.4f),
                    PathNode.LineTo(167.6f, 88.4f),
                    PathNode.CurveTo(204.21765f, 92.28691f, 232.00114f, 123.176636f, 232.0f, 160.0f),
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
                    PathNode.MoveTo(174.63f, 81.35f),
                    PathNode.CurveTo(167.24251f, 41.63174f, 131.40164f, 13.654274f, 91.07808f, 16.129156f),
                    PathNode.CurveTo(50.75451f, 18.604038f, 18.604038f, 50.75451f, 16.129156f, 91.07808f),
                    PathNode.CurveTo(13.654274f, 131.40164f, 41.63174f, 167.24251f, 81.35f, 174.63f),
                    PathNode.CurveTo(88.737495f, 214.34827f, 124.578354f, 242.32573f, 164.90192f, 239.85085f),
                    PathNode.CurveTo(205.2255f, 237.37596f, 237.37596f, 205.2255f, 239.85085f, 164.90192f),
                    PathNode.CurveTo(242.32573f, 124.578354f, 214.34827f, 88.737495f, 174.63f, 81.35f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 96.0f),
                    PathNode.CurveTo(32.0f, 60.653774f, 60.653774f, 32.0f, 96.0f, 32.0f),
                    PathNode.CurveTo(131.34622f, 32.0f, 160.0f, 60.653774f, 160.0f, 96.0f),
                    PathNode.CurveTo(160.0f, 131.34622f, 131.34622f, 160.0f, 96.0f, 160.0f),
                    PathNode.CurveTo(60.66977f, 159.96143f, 32.038578f, 131.33023f, 32.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 224.0f),
                    PathNode.CurveTo(130.78108f, 224.08221f, 105.23939f, 204.308f, 98.0f, 176.0f),
                    PathNode.CurveTo(140.6193f, 174.91173f, 174.91173f, 140.6193f, 176.0f, 98.0f),
                    PathNode.CurveTo(207.26846f, 106.00573f, 227.68216f, 136.04243f, 223.61613f, 168.06236f),
                    PathNode.CurveTo(219.55011f, 200.0823f, 192.277f, 224.06354f, 160.0f, 224.0f),
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
        return _subtract!!
    }

private var _subtract: ImageVector? = null
