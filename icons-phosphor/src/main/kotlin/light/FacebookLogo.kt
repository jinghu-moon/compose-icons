package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorLightIcon(
            name = "FacebookLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 26.0f),
                    PathNode.CurveTo(71.666954f, 26.0f, 26.0f, 71.666954f, 26.0f, 128.0f),
                    PathNode.CurveTo(26.0f, 184.33304f, 71.666954f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(184.33304f, 230.0f, 230.0f, 184.33304f, 230.0f, 128.0f),
                    PathNode.CurveTo(229.93387f, 71.69437f, 184.30563f, 26.066126f, 128.0f, 26.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 217.8f),
                    PathNode.LineTo(134.0f, 150.0f),
                    PathNode.LineTo(160.0f, 150.0f),
                    PathNode.CurveTo(163.3137f, 150.0f, 166.0f, 147.3137f, 166.0f, 144.0f),
                    PathNode.CurveTo(166.0f, 140.6863f, 163.3137f, 138.0f, 160.0f, 138.0f),
                    PathNode.LineTo(134.0f, 138.0f),
                    PathNode.LineTo(134.0f, 112.0f),
                    PathNode.CurveTo(134.0f, 102.05888f, 142.05887f, 94.0f, 152.0f, 94.0f),
                    PathNode.LineTo(168.0f, 94.0f),
                    PathNode.CurveTo(171.3137f, 94.0f, 174.0f, 91.313705f, 174.0f, 88.0f),
                    PathNode.CurveTo(174.0f, 84.686295f, 171.3137f, 82.0f, 168.0f, 82.0f),
                    PathNode.LineTo(152.0f, 82.0f),
                    PathNode.CurveTo(135.43146f, 82.0f, 122.0f, 95.43146f, 122.0f, 112.0f),
                    PathNode.LineTo(122.0f, 138.0f),
                    PathNode.LineTo(96.0f, 138.0f),
                    PathNode.CurveTo(92.686295f, 138.0f, 90.0f, 140.6863f, 90.0f, 144.0f),
                    PathNode.CurveTo(90.0f, 147.3137f, 92.686295f, 150.0f, 96.0f, 150.0f),
                    PathNode.LineTo(122.0f, 150.0f),
                    PathNode.LineTo(122.0f, 217.8f),
                    PathNode.CurveTo(73.570786f, 214.5642f, 36.431263f, 173.50874f, 38.050068f, 124.99855f),
                    PathNode.CurveTo(39.668877f, 76.48836f, 79.46281f, 38.00022f, 128.0f, 38.00022f),
                    PathNode.CurveTo(176.5372f, 38.00022f, 216.33112f, 76.48836f, 217.94994f, 124.99855f),
                    PathNode.CurveTo(219.56874f, 173.50874f, 182.42921f, 214.5642f, 134.0f, 217.8f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
