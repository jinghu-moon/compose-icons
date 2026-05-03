package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = phosphorDuotoneIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.LineTo(40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 114.74516f, 50.745167f, 104.0f, 64.0f, 104.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.CurveTo(205.25484f, 104.0f, 216.0f, 114.74516f, 216.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(247.87f, 30.59f),
                    PathNode.CurveTo(247.08893f, 26.24503f, 242.93588f, 23.354013f, 238.59f, 24.13f),
                    PathNode.LineTo(14.59f, 64.13f),
                    PathNode.CurveTo(10.523267f, 64.87209f, 7.691664f, 68.59036f, 8.057506f, 72.70803f),
                    PathNode.CurveTo(8.423347f, 76.8257f, 11.866136f, 79.9865f, 16.0f, 80.0f),
                    PathNode.CurveTo(16.475838f, 79.99935f, 16.950802f, 79.95921f, 17.42f, 79.88f),
                    PathNode.LineTo(120.0f, 61.56f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.LineTo(64.0f, 96.0f),
                    PathNode.CurveTo(46.32689f, 96.0f, 32.0f, 110.32689f, 32.0f, 128.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 209.67311f, 46.32689f, 224.0f, 64.0f, 224.0f),
                    PathNode.LineTo(192.0f, 224.0f),
                    PathNode.CurveTo(209.67311f, 224.0f, 224.0f, 209.67311f, 224.0f, 192.0f),
                    PathNode.LineTo(224.0f, 128.0f),
                    PathNode.CurveTo(224.0f, 110.32689f, 209.67311f, 96.0f, 192.0f, 96.0f),
                    PathNode.LineTo(136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 58.7f),
                    PathNode.LineTo(241.4f, 39.88f),
                    PathNode.CurveTo(243.49055f, 39.507317f, 245.34718f, 38.31876f, 246.56076f, 36.576202f),
                    PathNode.CurveTo(247.77438f, 34.833645f, 248.24538f, 32.680077f, 247.87f, 30.59f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 160.0f),
                    PathNode.LineTo(104.0f, 112.0f),
                    PathNode.LineTo(152.0f, 112.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 112.0f),
                    PathNode.LineTo(88.0f, 112.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.LineTo(48.0f, 128.0f),
                    PathNode.CurveTo(48.0f, 119.163445f, 55.163445f, 112.0f, 64.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 208.0f),
                    PathNode.LineTo(64.0f, 208.0f),
                    PathNode.CurveTo(55.163445f, 208.0f, 48.0f, 200.83656f, 48.0f, 192.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.LineTo(208.0f, 192.0f),
                    PathNode.CurveTo(208.0f, 200.83656f, 200.83656f, 208.0f, 192.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.LineTo(208.0f, 160.0f),
                    PathNode.LineTo(168.0f, 160.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.CurveTo(200.83656f, 112.0f, 208.0f, 119.163445f, 208.0f, 128.0f),
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
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
