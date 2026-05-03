package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Microscope: ImageVector
    get() {
        if (_microscope != null) return _microscope!!
        _microscope = phosphorBoldIcon(
            name = "Microscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 204.0f),
                    PathNode.LineTo(212.0f, 204.0f),
                    PathNode.CurveTo(230.02681f, 177.58421f, 233.05986f, 143.70786f, 220.01231f, 114.5099f),
                    PathNode.CurveTo(206.96477f, 85.311935f, 179.7046f, 64.97256f, 148.0f, 60.78f),
                    PathNode.LineTo(148.0f, 32.0f),
                    PathNode.CurveTo(148.0f, 20.954306f, 139.0457f, 12.0f, 128.0f, 12.0f),
                    PathNode.LineTo(80.0f, 12.0f),
                    PathNode.CurveTo(68.95431f, 12.0f, 60.0f, 20.954306f, 60.0f, 32.0f),
                    PathNode.LineTo(60.0f, 128.0f),
                    PathNode.CurveTo(60.0f, 139.0457f, 68.95431f, 148.0f, 80.0f, 148.0f),
                    PathNode.LineTo(128.0f, 148.0f),
                    PathNode.CurveTo(139.0457f, 148.0f, 148.0f, 139.0457f, 148.0f, 128.0f),
                    PathNode.LineTo(148.0f, 85.08f),
                    PathNode.CurveTo(180.38332f, 90.926865f, 203.95338f, 119.09312f, 204.0f, 152.0f),
                    PathNode.CurveTo(204.08511f, 172.0691f, 195.22092f, 191.1319f, 179.82f, 204.0f),
                    PathNode.LineTo(32.0f, 204.0f),
                    PathNode.CurveTo(25.372583f, 204.0f, 20.0f, 209.37259f, 20.0f, 216.0f),
                    PathNode.CurveTo(20.0f, 222.62741f, 25.372583f, 228.0f, 32.0f, 228.0f),
                    PathNode.LineTo(224.0f, 228.0f),
                    PathNode.CurveTo(230.62741f, 228.0f, 236.0f, 222.62741f, 236.0f, 216.0f),
                    PathNode.CurveTo(236.0f, 209.37259f, 230.62741f, 204.0f, 224.0f, 204.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 124.0f),
                    PathNode.LineTo(84.0f, 124.0f),
                    PathNode.LineTo(84.0f, 36.0f),
                    PathNode.LineTo(124.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(72.0f, 188.0f),
                    PathNode.CurveTo(65.37258f, 188.0f, 60.0f, 182.62741f, 60.0f, 176.0f),
                    PathNode.CurveTo(60.0f, 169.37259f, 65.37258f, 164.0f, 72.0f, 164.0f),
                    PathNode.LineTo(136.0f, 164.0f),
                    PathNode.CurveTo(142.62741f, 164.0f, 148.0f, 169.37259f, 148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 182.62741f, 142.62741f, 188.0f, 136.0f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _microscope!!
    }

private var _microscope: ImageVector? = null
