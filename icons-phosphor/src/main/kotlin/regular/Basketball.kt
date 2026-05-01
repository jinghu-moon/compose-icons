package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Basketball: ImageVector
    get() {
        if (_basketball != null) return _basketball!!
        _basketball = phosphorRegularIcon(
            name = "Basketball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 72.17f),
                    PathNode.CurveTo(71.22802f, 85.76235f, 78.07225f, 102.43886f, 79.63f, 120.0f),
                    PathNode.LineTo(40.37f, 120.0f),
                    PathNode.CurveTo(41.948624f, 102.443954f, 48.79042f, 85.77339f, 60.0f, 72.17f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 120.0f),
                    PathNode.LineTo(136.0f, 40.37f),
                    PathNode.CurveTo(153.93486f, 41.99432f, 170.93317f, 49.10721f, 184.68f, 60.74f),
                    PathNode.CurveTo(170.46281f, 77.40087f, 161.92323f, 98.15788f, 160.3f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 120.0f),
                    PathNode.LineTo(95.7f, 120.0f),
                    PathNode.CurveTo(94.076775f, 98.15788f, 85.537186f, 77.40087f, 71.32f, 60.74f),
                    PathNode.CurveTo(85.06684f, 49.10721f, 102.06515f, 41.99432f, 120.0f, 40.37f),
                    PathNode.Close,
                    PathNode.MoveTo(79.63f, 136.0f),
                    PathNode.CurveTo(78.07225f, 153.56114f, 71.22802f, 170.23764f, 60.0f, 183.83f),
                    PathNode.CurveTo(48.79042f, 170.22661f, 41.948624f, 153.55605f, 40.37f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(95.7f, 136.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 215.63f),
                    PathNode.CurveTo(102.06515f, 214.00568f, 85.06684f, 206.89278f, 71.32f, 195.26f),
                    PathNode.CurveTo(85.535385f, 178.59802f, 94.074715f, 157.84163f, 95.7f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 136.0f),
                    PathNode.LineTo(160.3f, 136.0f),
                    PathNode.CurveTo(161.92528f, 157.84163f, 170.46461f, 178.59802f, 184.68f, 195.26f),
                    PathNode.CurveTo(170.93317f, 206.89278f, 153.93486f, 214.00568f, 136.0f, 215.63f),
                    PathNode.Close,
                    PathNode.MoveTo(176.37f, 136.0f),
                    PathNode.LineTo(215.63f, 136.0f),
                    PathNode.CurveTo(214.05138f, 153.55605f, 207.20958f, 170.22661f, 196.0f, 183.83f),
                    PathNode.CurveTo(184.77199f, 170.23764f, 177.92775f, 153.56114f, 176.37f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.37f, 120.0f),
                    PathNode.CurveTo(177.92775f, 102.43886f, 184.77199f, 85.76235f, 196.0f, 72.17f),
                    PathNode.CurveTo(207.20958f, 85.77339f, 214.05138f, 102.443954f, 215.63f, 120.0f),
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
        return _basketball!!
    }

private var _basketball: ImageVector? = null
