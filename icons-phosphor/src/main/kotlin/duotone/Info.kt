package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Info: ImageVector
    get() {
        if (_info != null) return _info!!
        _info = phosphorDuotoneIcon(
            name = "Info",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 181.01933f, 181.01933f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(74.98067f, 224.0f, 32.0f, 181.01933f, 32.0f, 128.0f),
                    PathNode.CurveTo(32.0f, 74.98067f, 74.98067f, 32.0f, 128.0f, 32.0f),
                    PathNode.CurveTo(181.01933f, 32.0f, 224.0f, 74.98067f, 224.0f, 128.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 180.41827f, 140.41827f, 184.0f, 136.0f, 184.0f),
                    PathNode.CurveTo(127.163445f, 184.0f, 120.0f, 176.83656f, 120.0f, 168.0f),
                    PathNode.LineTo(120.0f, 128.0f),
                    PathNode.CurveTo(115.58172f, 128.0f, 112.0f, 124.41828f, 112.0f, 120.0f),
                    PathNode.CurveTo(112.0f, 115.58172f, 115.58172f, 112.0f, 120.0f, 112.0f),
                    PathNode.CurveTo(128.83656f, 112.0f, 136.0f, 119.163445f, 136.0f, 128.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.CurveTo(140.41827f, 168.0f, 144.0f, 171.58173f, 144.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 128.0f),
                    PathNode.CurveTo(232.0f, 185.4376f, 185.4376f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(70.562386f, 232.0f, 24.0f, 185.4376f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 70.562386f, 70.562386f, 24.0f, 128.0f, 24.0f),
                    PathNode.CurveTo(185.41248f, 24.060629f, 231.93938f, 70.58752f, 232.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(216.0f, 79.39894f, 176.60106f, 40.0f, 128.0f, 40.0f),
                    PathNode.CurveTo(79.39894f, 40.0f, 40.0f, 79.39894f, 40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 176.60106f, 79.39894f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(176.57822f, 215.94489f, 215.94489f, 176.57822f, 216.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 96.0f),
                    PathNode.CurveTo(130.62741f, 96.0f, 136.0f, 90.62742f, 136.0f, 84.0f),
                    PathNode.CurveTo(136.0f, 77.37258f, 130.62741f, 72.0f, 124.0f, 72.0f),
                    PathNode.CurveTo(117.37258f, 72.0f, 112.0f, 77.37258f, 112.0f, 84.0f),
                    PathNode.CurveTo(112.0f, 90.62742f, 117.37258f, 96.0f, 124.0f, 96.0f),
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
        return _info!!
    }

private var _info: ImageVector? = null
