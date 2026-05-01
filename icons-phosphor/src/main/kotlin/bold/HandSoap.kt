package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandSoap: ImageVector
    get() {
        if (_handSoap != null) return _handSoap!!
        _handSoap = phosphorBoldIcon(
            name = "HandSoap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 97.68f),
                    PathNode.LineTo(188.0f, 92.0f),
                    PathNode.CurveTo(188.0f, 72.11775f, 171.88223f, 56.0f, 152.0f, 56.0f),
                    PathNode.LineTo(140.0f, 56.0f),
                    PathNode.LineTo(140.0f, 36.0f),
                    PathNode.LineTo(168.0f, 36.0f),
                    PathNode.CurveTo(170.20914f, 36.0f, 172.0f, 37.79086f, 172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 46.62742f, 177.37259f, 52.0f, 184.0f, 52.0f),
                    PathNode.CurveTo(190.62741f, 52.0f, 196.0f, 46.62742f, 196.0f, 40.0f),
                    PathNode.CurveTo(196.0f, 24.536028f, 183.46397f, 12.0f, 168.0f, 12.0f),
                    PathNode.LineTo(104.0f, 12.0f),
                    PathNode.CurveTo(97.37258f, 12.0f, 92.0f, 17.372583f, 92.0f, 24.0f),
                    PathNode.CurveTo(92.0f, 30.627417f, 97.37258f, 36.0f, 104.0f, 36.0f),
                    PathNode.LineTo(116.0f, 36.0f),
                    PathNode.LineTo(116.0f, 56.0f),
                    PathNode.LineTo(104.0f, 56.0f),
                    PathNode.CurveTo(84.11775f, 56.0f, 68.0f, 72.11775f, 68.0f, 92.0f),
                    PathNode.LineTo(68.0f, 97.68f),
                    PathNode.CurveTo(49.083385f, 103.063385f, 36.025604f, 120.3323f, 36.0f, 140.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 227.0457f, 44.954304f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 140.0f),
                    PathNode.CurveTo(219.9744f, 120.3323f, 206.91661f, 103.063385f, 188.0f, 97.68f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(158.62741f, 80.0f, 164.0f, 85.37258f, 164.0f, 92.0f),
                    PathNode.LineTo(164.0f, 96.0f),
                    PathNode.LineTo(92.0f, 96.0f),
                    PathNode.LineTo(92.0f, 92.0f),
                    PathNode.CurveTo(92.0f, 85.37258f, 97.37258f, 80.0f, 104.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 212.0f),
                    PathNode.LineTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 140.0f),
                    PathNode.CurveTo(60.0f, 128.9543f, 68.95431f, 120.0f, 80.0f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.CurveTo(187.0457f, 120.0f, 196.0f, 128.9543f, 196.0f, 140.0f),
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
        return _handSoap!!
    }

private var _handSoap: ImageVector? = null
