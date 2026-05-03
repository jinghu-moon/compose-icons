package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UploadSimple: ImageVector
    get() {
        if (_uploadSimple != null) return _uploadSimple!!
        _uploadSimple = phosphorLightIcon(
            name = "UploadSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(222.0f, 144.0f),
                    PathNode.LineTo(222.0f, 208.0f),
                    PathNode.CurveTo(222.0f, 211.3137f, 219.3137f, 214.0f, 216.0f, 214.0f),
                    PathNode.LineTo(40.0f, 214.0f),
                    PathNode.CurveTo(36.68629f, 214.0f, 34.0f, 211.3137f, 34.0f, 208.0f),
                    PathNode.LineTo(34.0f, 144.0f),
                    PathNode.CurveTo(34.0f, 140.6863f, 36.68629f, 138.0f, 40.0f, 138.0f),
                    PathNode.CurveTo(43.31371f, 138.0f, 46.0f, 140.6863f, 46.0f, 144.0f),
                    PathNode.LineTo(46.0f, 202.0f),
                    PathNode.LineTo(210.0f, 202.0f),
                    PathNode.LineTo(210.0f, 144.0f),
                    PathNode.CurveTo(210.0f, 140.6863f, 212.6863f, 138.0f, 216.0f, 138.0f),
                    PathNode.CurveTo(219.3137f, 138.0f, 222.0f, 140.6863f, 222.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.24f, 76.24f),
                    PathNode.LineTo(122.0f, 46.49f),
                    PathNode.LineTo(122.0f, 144.0f),
                    PathNode.CurveTo(122.0f, 147.3137f, 124.686295f, 150.0f, 128.0f, 150.0f),
                    PathNode.CurveTo(131.3137f, 150.0f, 134.0f, 147.3137f, 134.0f, 144.0f),
                    PathNode.LineTo(134.0f, 46.49f),
                    PathNode.LineTo(163.76f, 76.24f),
                    PathNode.CurveTo(166.12408f, 78.44287f, 169.80807f, 78.37787f, 172.09297f, 76.09297f),
                    PathNode.CurveTo(174.37787f, 73.808075f, 174.44287f, 70.12408f, 172.24f, 67.76f),
                    PathNode.LineTo(132.24f, 27.76f),
                    PathNode.CurveTo(129.89746f, 25.420374f, 126.10254f, 25.420374f, 123.76f, 27.76f),
                    PathNode.LineTo(83.76f, 67.76f),
                    PathNode.CurveTo(81.55713f, 70.12408f, 81.62213f, 73.808075f, 83.90703f, 76.09297f),
                    PathNode.CurveTo(86.191925f, 78.37787f, 89.87592f, 78.44287f, 92.24f, 76.24f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _uploadSimple!!
    }

private var _uploadSimple: ImageVector? = null
