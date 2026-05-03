package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MemberOf: ImageVector
    get() {
        if (_memberOf != null) return _memberOf!!
        _memberOf = phosphorFillIcon(
            name = "MemberOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 120.0f),
                    PathNode.CurveTo(180.41827f, 120.0f, 184.0f, 123.58172f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 132.41827f, 180.41827f, 136.0f, 176.0f, 136.0f),
                    PathNode.LineTo(80.68f, 136.0f),
                    PathNode.CurveTo(84.60984f, 159.07654f, 104.59126f, 175.967f, 128.0f, 176.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.CurveTo(180.41827f, 176.0f, 184.0f, 179.58173f, 184.0f, 184.0f),
                    PathNode.CurveTo(184.0f, 188.41827f, 180.41827f, 192.0f, 176.0f, 192.0f),
                    PathNode.LineTo(128.0f, 192.0f),
                    PathNode.CurveTo(92.65378f, 192.0f, 64.0f, 163.34622f, 64.0f, 128.0f),
                    PathNode.CurveTo(64.0f, 92.65378f, 92.65378f, 64.0f, 128.0f, 64.0f),
                    PathNode.LineTo(176.0f, 64.0f),
                    PathNode.CurveTo(180.41827f, 64.0f, 184.0f, 67.58172f, 184.0f, 72.0f),
                    PathNode.CurveTo(184.0f, 76.41828f, 180.41827f, 80.0f, 176.0f, 80.0f),
                    PathNode.LineTo(128.0f, 80.0f),
                    PathNode.CurveTo(104.59126f, 80.033005f, 84.60984f, 96.92347f, 80.68f, 120.0f),
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
        return _memberOf!!
    }

private var _memberOf: ImageVector? = null
