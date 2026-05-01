package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SecurityCamera: ImageVector
    get() {
        if (_securityCamera != null) return _securityCamera!!
        _securityCamera = phosphorRegularIcon(
            name = "SecurityCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 136.0f),
                    PathNode.CurveTo(243.58173f, 136.0f, 240.0f, 139.58173f, 240.0f, 144.0f),
                    PathNode.LineTo(240.0f, 160.0f),
                    PathNode.LineTo(195.31f, 160.0f),
                    PathNode.LineTo(177.0f, 141.66f),
                    PathNode.LineTo(227.34f, 91.31f),
                    PathNode.CurveTo(233.58345f, 85.06246f, 233.58345f, 74.93754f, 227.34f, 68.69f),
                    PathNode.LineTo(171.34f, 12.69f),
                    PathNode.CurveTo(168.33931f, 9.688628f, 164.2691f, 8.002417f, 160.025f, 8.002417f),
                    PathNode.CurveTo(155.7809f, 8.002417f, 151.7107f, 9.688628f, 148.71f, 12.69f),
                    PathNode.LineTo(2.92f, 158.94f),
                    PathNode.CurveTo(0.066778f, 161.80215f, -0.783185f, 166.10037f, 0.765912f, 169.83308f),
                    PathNode.CurveTo(2.315009f, 173.5658f, 5.95861f, 175.99915f, 10.0f, 176.0f),
                    PathNode.LineTo(49.37f, 176.0f),
                    PathNode.LineTo(84.69f, 211.31f),
                    PathNode.CurveTo(90.93754f, 217.55345f, 101.06246f, 217.55345f, 107.31f, 211.31f),
                    PathNode.LineTo(165.66f, 153.0f),
                    PathNode.LineTo(184.0f, 171.31f),
                    PathNode.CurveTo(186.99025f, 174.32419f, 191.06421f, 176.01357f, 195.31f, 176.0f),
                    PathNode.LineTo(240.0f, 176.0f),
                    PathNode.LineTo(240.0f, 192.0f),
                    PathNode.CurveTo(240.0f, 196.41827f, 243.58173f, 200.0f, 248.0f, 200.0f),
                    PathNode.CurveTo(252.41827f, 200.0f, 256.0f, 196.41827f, 256.0f, 192.0f),
                    PathNode.LineTo(256.0f, 144.0f),
                    PathNode.CurveTo(256.0f, 139.58173f, 252.41827f, 136.0f, 248.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 24.0f),
                    PathNode.LineTo(172.69f, 36.69f),
                    PathNode.LineTo(49.37f, 160.0f),
                    PathNode.LineTo(24.46f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 200.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.LineTo(216.0f, 80.0f),
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
        return _securityCamera!!
    }

private var _securityCamera: ImageVector? = null
