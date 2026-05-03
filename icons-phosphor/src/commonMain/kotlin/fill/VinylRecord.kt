package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) return _vinylRecord!!
        _vinylRecord = phosphorFillIcon(
            name = "VinylRecord",
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
                    PathNode.MoveTo(72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 132.41827f, 68.41828f, 136.0f, 64.0f, 136.0f),
                    PathNode.CurveTo(59.581722f, 136.0f, 56.0f, 132.41827f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.04409f, 88.25378f, 88.25378f, 56.04409f, 128.0f, 56.0f),
                    PathNode.CurveTo(132.41827f, 56.0f, 136.0f, 59.581722f, 136.0f, 64.0f),
                    PathNode.CurveTo(136.0f, 68.41828f, 132.41827f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(97.08576f, 72.033066f, 72.033066f, 97.08576f, 72.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 128.0f),
                    PathNode.CurveTo(104.0f, 114.74516f, 114.74516f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(141.25484f, 104.0f, 152.0f, 114.74516f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 141.25484f, 141.25484f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(114.74516f, 152.0f, 104.0f, 141.25484f, 104.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(123.58172f, 200.0f, 120.0f, 196.41827f, 120.0f, 192.0f),
                    PathNode.CurveTo(120.0f, 187.58173f, 123.58172f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(158.91423f, 183.96693f, 183.96693f, 158.91423f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 123.58172f, 187.58173f, 120.0f, 192.0f, 120.0f),
                    PathNode.CurveTo(196.41827f, 120.0f, 200.0f, 123.58172f, 200.0f, 128.0f),
                    PathNode.CurveTo(199.95592f, 167.74623f, 167.74623f, 199.95592f, 128.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
