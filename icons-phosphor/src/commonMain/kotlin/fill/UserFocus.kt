package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserFocus: ImageVector
    get() {
        if (_userFocus != null) return _userFocus!!
        _userFocus = phosphorFillIcon(
            name = "UserFocus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 40.0f),
                    PathNode.LineTo(224.0f, 76.0f),
                    PathNode.CurveTo(224.0f, 80.41828f, 220.41827f, 84.0f, 216.0f, 84.0f),
                    PathNode.CurveTo(211.58173f, 84.0f, 208.0f, 80.41828f, 208.0f, 76.0f),
                    PathNode.LineTo(208.0f, 48.0f),
                    PathNode.LineTo(180.0f, 48.0f),
                    PathNode.CurveTo(175.58173f, 48.0f, 172.0f, 44.418278f, 172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 35.581722f, 175.58173f, 32.0f, 180.0f, 32.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(220.41827f, 32.0f, 224.0f, 35.581722f, 224.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 172.0f),
                    PathNode.CurveTo(211.58173f, 172.0f, 208.0f, 175.58173f, 208.0f, 180.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.LineTo(180.0f, 208.0f),
                    PathNode.CurveTo(175.58173f, 208.0f, 172.0f, 211.58173f, 172.0f, 216.0f),
                    PathNode.CurveTo(172.0f, 220.41827f, 175.58173f, 224.0f, 180.0f, 224.0f),
                    PathNode.LineTo(216.0f, 224.0f),
                    PathNode.CurveTo(220.41827f, 224.0f, 224.0f, 220.41827f, 224.0f, 216.0f),
                    PathNode.LineTo(224.0f, 180.0f),
                    PathNode.CurveTo(224.0f, 175.58173f, 220.41827f, 172.0f, 216.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 180.0f),
                    PathNode.CurveTo(48.0f, 175.58173f, 44.418278f, 172.0f, 40.0f, 172.0f),
                    PathNode.CurveTo(35.581722f, 172.0f, 32.0f, 175.58173f, 32.0f, 180.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(32.0f, 220.41827f, 35.581722f, 224.0f, 40.0f, 224.0f),
                    PathNode.LineTo(76.0f, 224.0f),
                    PathNode.CurveTo(80.41828f, 224.0f, 84.0f, 220.41827f, 84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 211.58173f, 80.41828f, 208.0f, 76.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 84.0f),
                    PathNode.CurveTo(44.418278f, 84.0f, 48.0f, 80.41828f, 48.0f, 76.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(76.0f, 48.0f),
                    PathNode.CurveTo(80.41828f, 48.0f, 84.0f, 44.418278f, 84.0f, 40.0f),
                    PathNode.CurveTo(84.0f, 35.581722f, 80.41828f, 32.0f, 76.0f, 32.0f),
                    PathNode.LineTo(40.0f, 32.0f),
                    PathNode.CurveTo(35.581722f, 32.0f, 32.0f, 35.581722f, 32.0f, 40.0f),
                    PathNode.LineTo(32.0f, 76.0f),
                    PathNode.CurveTo(32.0f, 80.41828f, 35.581722f, 84.0f, 40.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(101.0f, 141.51f),
                    PathNode.CurveTo(90.13283f, 146.22443f, 80.68714f, 153.69824f, 73.6f, 163.19f),
                    PathNode.CurveTo(71.77593f, 165.61418f, 71.48005f, 168.86156f, 72.83595f, 171.57547f),
                    PathNode.CurveTo(74.19185f, 174.2894f, 76.96622f, 176.00285f, 80.0f, 176.0f),
                    PathNode.LineTo(176.0f, 176.0f),
                    PathNode.CurveTo(179.03378f, 176.00285f, 181.80815f, 174.2894f, 183.16405f, 171.57547f),
                    PathNode.CurveTo(184.51996f, 168.86156f, 184.22406f, 165.61418f, 182.4f, 163.19f),
                    PathNode.CurveTo(175.31287f, 153.69824f, 165.86717f, 146.22443f, 155.0f, 141.51f),
                    PathNode.CurveTo(167.19264f, 130.37817f, 171.2933f, 112.89904f, 165.32347f, 97.50621f),
                    PathNode.CurveTo(159.3536f, 82.113396f, 144.53995f, 71.96987f, 128.03f, 71.96987f),
                    PathNode.CurveTo(111.52006f, 71.96987f, 96.70639f, 82.113396f, 90.736534f, 97.50621f),
                    PathNode.CurveTo(84.76668f, 112.89904f, 88.867355f, 130.37817f, 101.06f, 141.51f),
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
        return _userFocus!!
    }

private var _userFocus: ImageVector? = null
