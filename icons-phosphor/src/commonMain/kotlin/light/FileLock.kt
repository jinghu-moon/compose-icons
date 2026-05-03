package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FileLock: ImageVector
    get() {
        if (_fileLock != null) return _fileLock!!
        _fileLock = phosphorLightIcon(
            name = "FileLock",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 178.0f),
                    PathNode.LineTo(110.0f, 178.0f),
                    PathNode.LineTo(110.0f, 172.0f),
                    PathNode.CurveTo(110.0f, 157.6406f, 98.359406f, 146.0f, 84.0f, 146.0f),
                    PathNode.CurveTo(69.640594f, 146.0f, 58.0f, 157.6406f, 58.0f, 172.0f),
                    PathNode.LineTo(58.0f, 178.0f),
                    PathNode.LineTo(48.0f, 178.0f),
                    PathNode.CurveTo(44.68629f, 178.0f, 42.0f, 180.6863f, 42.0f, 184.0f),
                    PathNode.LineTo(42.0f, 224.0f),
                    PathNode.CurveTo(42.0f, 227.3137f, 44.68629f, 230.0f, 48.0f, 230.0f),
                    PathNode.LineTo(120.0f, 230.0f),
                    PathNode.CurveTo(123.313705f, 230.0f, 126.0f, 227.3137f, 126.0f, 224.0f),
                    PathNode.LineTo(126.0f, 184.0f),
                    PathNode.CurveTo(126.0f, 180.6863f, 123.313705f, 178.0f, 120.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 172.0f),
                    PathNode.CurveTo(70.0f, 164.26802f, 76.26801f, 158.0f, 84.0f, 158.0f),
                    PathNode.CurveTo(91.73199f, 158.0f, 98.0f, 164.26802f, 98.0f, 172.0f),
                    PathNode.LineTo(98.0f, 178.0f),
                    PathNode.LineTo(70.0f, 178.0f),
                    PathNode.Close,
                    PathNode.MoveTo(114.0f, 218.0f),
                    PathNode.LineTo(54.0f, 218.0f),
                    PathNode.LineTo(54.0f, 190.0f),
                    PathNode.LineTo(114.0f, 190.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.24f, 83.76f),
                    PathNode.LineTo(156.24f, 27.76f),
                    PathNode.CurveTo(155.11586f, 26.63446f, 153.59076f, 26.0014f, 152.0f, 26.0f),
                    PathNode.LineTo(56.0f, 26.0f),
                    PathNode.CurveTo(48.268013f, 26.0f, 42.0f, 32.268013f, 42.0f, 40.0f),
                    PathNode.LineTo(42.0f, 128.0f),
                    PathNode.CurveTo(42.0f, 131.3137f, 44.68629f, 134.0f, 48.0f, 134.0f),
                    PathNode.CurveTo(51.31371f, 134.0f, 54.0f, 131.3137f, 54.0f, 128.0f),
                    PathNode.LineTo(54.0f, 40.0f),
                    PathNode.CurveTo(54.0f, 38.89543f, 54.89543f, 38.0f, 56.0f, 38.0f),
                    PathNode.LineTo(146.0f, 38.0f),
                    PathNode.LineTo(146.0f, 88.0f),
                    PathNode.CurveTo(146.0f, 91.313705f, 148.6863f, 94.0f, 152.0f, 94.0f),
                    PathNode.LineTo(202.0f, 94.0f),
                    PathNode.LineTo(202.0f, 216.0f),
                    PathNode.CurveTo(202.0f, 217.10457f, 201.10457f, 218.0f, 200.0f, 218.0f),
                    PathNode.LineTo(160.0f, 218.0f),
                    PathNode.CurveTo(156.6863f, 218.0f, 154.0f, 220.6863f, 154.0f, 224.0f),
                    PathNode.CurveTo(154.0f, 227.3137f, 156.6863f, 230.0f, 160.0f, 230.0f),
                    PathNode.LineTo(200.0f, 230.0f),
                    PathNode.CurveTo(207.73198f, 230.0f, 214.0f, 223.73198f, 214.0f, 216.0f),
                    PathNode.LineTo(214.0f, 88.0f),
                    PathNode.CurveTo(213.9986f, 86.40924f, 213.36554f, 84.88415f, 212.24f, 83.76f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 46.48f),
                    PathNode.LineTo(193.52f, 82.0f),
                    PathNode.LineTo(158.0f, 82.0f),
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
        return _fileLock!!
    }

private var _fileLock: ImageVector? = null
