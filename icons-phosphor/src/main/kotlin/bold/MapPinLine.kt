package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) return _mapPinLine!!
        _mapPinLine = phosphorBoldIcon(
            name = "MapPinLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 220.0f),
                    PathNode.LineTo(160.73f, 220.0f),
                    PathNode.CurveTo(165.91f, 215.0f, 171.48f, 209.29f, 177.06f, 202.87f),
                    PathNode.CurveTo(205.15f, 170.57f, 220.0f, 136.37f, 220.0f, 104.0f),
                    PathNode.CurveTo(220.0f, 53.189804f, 178.8102f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(77.18981f, 12.0f, 36.0f, 53.189804f, 36.0f, 104.0f),
                    PathNode.CurveTo(36.0f, 154.0f, 70.12f, 195.94f, 95.18f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(49.37258f, 220.0f, 44.0f, 225.37259f, 44.0f, 232.0f),
                    PathNode.CurveTo(44.0f, 238.62741f, 49.37258f, 244.0f, 56.0f, 244.0f),
                    PathNode.LineTo(200.0f, 244.0f),
                    PathNode.CurveTo(206.62741f, 244.0f, 212.0f, 238.62741f, 212.0f, 232.0f),
                    PathNode.CurveTo(212.0f, 225.37259f, 206.62741f, 220.0f, 200.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 104.0f),
                    PathNode.CurveTo(60.0f, 66.44463f, 90.44463f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(165.55536f, 36.0f, 196.0f, 66.44463f, 196.0f, 104.0f),
                    PathNode.CurveTo(196.0f, 137.31f, 176.0f, 167.37f, 159.3f, 186.71f),
                    PathNode.CurveTo(149.76535f, 197.6622f, 139.2922f, 207.76057f, 128.0f, 216.89f),
                    PathNode.CurveTo(116.707794f, 207.76057f, 106.23466f, 197.6622f, 96.7f, 186.71f),
                    PathNode.CurveTo(80.0f, 167.37f, 60.0f, 137.31f, 60.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 148.0f),
                    PathNode.CurveTo(152.30052f, 148.0f, 172.0f, 128.30052f, 172.0f, 104.0f),
                    PathNode.CurveTo(172.0f, 79.69947f, 152.30052f, 60.0f, 128.0f, 60.0f),
                    PathNode.CurveTo(103.69947f, 60.0f, 84.0f, 79.69947f, 84.0f, 104.0f),
                    PathNode.CurveTo(84.02756f, 128.28911f, 103.71089f, 147.97244f, 128.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 84.0f),
                    PathNode.CurveTo(139.0457f, 84.0f, 148.0f, 92.95431f, 148.0f, 104.0f),
                    PathNode.CurveTo(148.0f, 115.04569f, 139.0457f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(116.95431f, 124.0f, 108.0f, 115.04569f, 108.0f, 104.0f),
                    PathNode.CurveTo(108.0f, 92.95431f, 116.95431f, 84.0f, 128.0f, 84.0f),
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
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
