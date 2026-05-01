package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Buildings: ImageVector
    get() {
        if (_buildings != null) return _buildings!!
        _buildings = phosphorDuotoneIcon(
            name = "Buildings",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 32.0f),
                    PathNode.LineTo(136.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 85.35f),
                    PathNode.CurveTo(39.99826f, 82.674355f, 41.334263f, 80.17499f, 43.56f, 78.69f),
                    PathNode.LineTo(123.56f, 25.36f),
                    PathNode.CurveTo(126.01248f, 23.723728f, 129.16615f, 23.568956f, 131.76707f, 24.957228f),
                    PathNode.CurveTo(134.368f, 26.345497f, 135.99455f, 29.051777f, 136.0f, 32.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(224.0f, 87.163445f, 216.83656f, 80.0f, 208.0f, 80.0f),
                    PathNode.LineTo(144.0f, 80.0f),
                    PathNode.LineTo(144.0f, 32.0f),
                    PathNode.CurveTo(144.00383f, 26.096375f, 140.75644f, 20.670326f, 135.55177f, 17.883902f),
                    PathNode.CurveTo(130.34709f, 15.097476f, 124.03093f, 15.403486f, 119.12f, 18.68f),
                    PathNode.LineTo(39.12f, 72.0f),
                    PathNode.CurveTo(34.66262f, 74.97389f, 31.989828f, 79.98163f, 32.0f, 85.34f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.LineTo(16.0f, 208.0f),
                    PathNode.CurveTo(11.581722f, 208.0f, 8.0f, 211.58173f, 8.0f, 216.0f),
                    PathNode.CurveTo(8.0f, 220.41827f, 11.581722f, 224.0f, 16.0f, 224.0f),
                    PathNode.LineTo(240.0f, 224.0f),
                    PathNode.CurveTo(244.41827f, 224.0f, 248.0f, 220.41827f, 248.0f, 216.0f),
                    PathNode.CurveTo(248.0f, 211.58173f, 244.41827f, 208.0f, 240.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.LineTo(144.0f, 208.0f),
                    PathNode.LineTo(144.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(48.0f, 85.34f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.LineTo(128.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 112.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.CurveTo(112.0f, 132.41827f, 108.41828f, 136.0f, 104.0f, 136.0f),
                    PathNode.CurveTo(99.58172f, 136.0f, 96.0f, 132.41827f, 96.0f, 128.0f),
                    PathNode.LineTo(96.0f, 112.0f),
                    PathNode.CurveTo(96.0f, 107.58172f, 99.58172f, 104.0f, 104.0f, 104.0f),
                    PathNode.CurveTo(108.41828f, 104.0f, 112.0f, 107.58172f, 112.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 112.0f),
                    PathNode.LineTo(80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 132.41827f, 76.41828f, 136.0f, 72.0f, 136.0f),
                    PathNode.CurveTo(67.58172f, 136.0f, 64.0f, 132.41827f, 64.0f, 128.0f),
                    PathNode.LineTo(64.0f, 112.0f),
                    PathNode.CurveTo(64.0f, 107.58172f, 67.58172f, 104.0f, 72.0f, 104.0f),
                    PathNode.CurveTo(76.41828f, 104.0f, 80.0f, 107.58172f, 80.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 168.0f),
                    PathNode.LineTo(80.0f, 184.0f),
                    PathNode.CurveTo(80.0f, 188.41827f, 76.41828f, 192.0f, 72.0f, 192.0f),
                    PathNode.CurveTo(67.58172f, 192.0f, 64.0f, 188.41827f, 64.0f, 184.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.CurveTo(64.0f, 163.58173f, 67.58172f, 160.0f, 72.0f, 160.0f),
                    PathNode.CurveTo(76.41828f, 160.0f, 80.0f, 163.58173f, 80.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 168.0f),
                    PathNode.LineTo(112.0f, 184.0f),
                    PathNode.CurveTo(112.0f, 188.41827f, 108.41828f, 192.0f, 104.0f, 192.0f),
                    PathNode.CurveTo(99.58172f, 192.0f, 96.0f, 188.41827f, 96.0f, 184.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.CurveTo(96.0f, 163.58173f, 99.58172f, 160.0f, 104.0f, 160.0f),
                    PathNode.CurveTo(108.41828f, 160.0f, 112.0f, 163.58173f, 112.0f, 168.0f),
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
        return _buildings!!
    }

private var _buildings: ImageVector? = null
