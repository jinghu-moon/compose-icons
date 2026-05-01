package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HardDrive: ImageVector
    get() {
        if (_hardDrive != null) return _hardDrive!!
        _hardDrive = phosphorThinIcon(
            name = "HardDrive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 68.0f),
                    PathNode.LineTo(32.0f, 68.0f),
                    PathNode.CurveTo(25.372583f, 68.0f, 20.0f, 73.37258f, 20.0f, 80.0f),
                    PathNode.LineTo(20.0f, 176.0f),
                    PathNode.CurveTo(20.0f, 182.62741f, 25.372583f, 188.0f, 32.0f, 188.0f),
                    PathNode.LineTo(224.0f, 188.0f),
                    PathNode.CurveTo(230.62741f, 188.0f, 236.0f, 182.62741f, 236.0f, 176.0f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 73.37258f, 230.62741f, 68.0f, 224.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 176.0f),
                    PathNode.CurveTo(228.0f, 178.20914f, 226.20914f, 180.0f, 224.0f, 180.0f),
                    PathNode.LineTo(32.0f, 180.0f),
                    PathNode.CurveTo(29.790861f, 180.0f, 28.0f, 178.20914f, 28.0f, 176.0f),
                    PathNode.LineTo(28.0f, 80.0f),
                    PathNode.CurveTo(28.0f, 77.79086f, 29.790861f, 76.0f, 32.0f, 76.0f),
                    PathNode.LineTo(224.0f, 76.0f),
                    PathNode.CurveTo(226.20914f, 76.0f, 228.0f, 77.79086f, 228.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 128.0f),
                    PathNode.CurveTo(196.0f, 132.41827f, 192.41827f, 136.0f, 188.0f, 136.0f),
                    PathNode.CurveTo(183.58173f, 136.0f, 180.0f, 132.41827f, 180.0f, 128.0f),
                    PathNode.CurveTo(180.0f, 123.58172f, 183.58173f, 120.0f, 188.0f, 120.0f),
                    PathNode.CurveTo(192.41827f, 120.0f, 196.0f, 123.58172f, 196.0f, 128.0f),
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
        return _hardDrive!!
    }

private var _hardDrive: ImageVector? = null
