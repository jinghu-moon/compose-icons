package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorFillIcon(
            name = "UploadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 144.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 212.41827f, 220.41827f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(35.581722f, 216.0f, 32.0f, 212.41827f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 144.0f),
                    PathNode.CurveTo(32.0f, 139.58173f, 35.581722f, 136.0f, 40.0f, 136.0f),
                    PathNode.CurveTo(44.418278f, 136.0f, 48.0f, 139.58173f, 48.0f, 144.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.LineTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 139.58173f, 211.58173f, 136.0f, 216.0f, 136.0f),
                    PathNode.CurveTo(220.41827f, 136.0f, 224.0f, 139.58173f, 224.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 80.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 148.41827f, 123.58172f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(132.41827f, 152.0f, 136.0f, 148.41827f, 136.0f, 144.0f),
                    PathNode.LineTo(136.0f, 80.0f),
                    PathNode.LineTo(168.0f, 80.0f),
                    PathNode.CurveTo(171.23764f, 80.00255f, 174.15764f, 78.05338f, 175.39697f, 75.062325f),
                    PathNode.CurveTo(176.63632f, 72.07126f, 175.95064f, 68.62809f, 173.66f, 66.34f),
                    PathNode.LineTo(133.66f, 26.34f),
                    PathNode.CurveTo(132.15945f, 24.837784f, 130.12328f, 23.993708f, 128.0f, 23.993708f),
                    PathNode.CurveTo(125.876724f, 23.993708f, 123.840546f, 24.837784f, 122.34f, 26.34f),
                    PathNode.LineTo(82.34f, 66.34f),
                    PathNode.CurveTo(80.04936f, 68.62809f, 79.36368f, 72.07126f, 80.60302f, 75.062325f),
                    PathNode.CurveTo(81.84236f, 78.05338f, 84.762344f, 80.00255f, 88.0f, 80.0f),
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
        return _uploadSimple!!
    }

private var _uploadSimple: ImageVector? = null
