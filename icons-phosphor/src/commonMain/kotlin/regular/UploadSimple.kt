package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorRegularIcon(
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
                    PathNode.MoveTo(93.66f, 77.66f),
                    PathNode.LineTo(120.0f, 51.31f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 148.41827f, 123.58172f, 152.0f, 128.0f, 152.0f),
                    PathNode.CurveTo(132.41827f, 152.0f, 136.0f, 148.41827f, 136.0f, 144.0f),
                    PathNode.LineTo(136.0f, 51.31f),
                    PathNode.LineTo(162.34f, 77.66f),
                    PathNode.CurveTo(165.46593f, 80.785934f, 170.53407f, 80.785934f, 173.66f, 77.66f),
                    PathNode.CurveTo(176.78593f, 74.534065f, 176.78593f, 69.465935f, 173.66f, 66.34f),
                    PathNode.LineTo(133.66f, 26.34f),
                    PathNode.CurveTo(132.15945f, 24.837784f, 130.12328f, 23.993708f, 128.0f, 23.993708f),
                    PathNode.CurveTo(125.876724f, 23.993708f, 123.840546f, 24.837784f, 122.34f, 26.34f),
                    PathNode.LineTo(82.34f, 66.34f),
                    PathNode.CurveTo(79.214066f, 69.465935f, 79.214066f, 74.534065f, 82.34f, 77.66f),
                    PathNode.CurveTo(85.465935f, 80.785934f, 90.534065f, 80.785934f, 93.66f, 77.66f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _uploadSimple!!
    }

private var _uploadSimple: ImageVector? = null
