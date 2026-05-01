package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Asterisk: ImageVector
    get() {
        if (_asterisk != null) return _asterisk!!
        _asterisk = phosphorLightIcon(
            name = "Asterisk",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.14f, 179.09f),
                    PathNode.CurveTo(211.43585f, 181.93103f, 207.75159f, 182.85323f, 204.91f, 181.15f),
                    PathNode.LineTo(134.0f, 138.6f),
                    PathNode.LineTo(134.0f, 216.0f),
                    PathNode.CurveTo(134.0f, 219.3137f, 131.3137f, 222.0f, 128.0f, 222.0f),
                    PathNode.CurveTo(124.686295f, 222.0f, 122.0f, 219.3137f, 122.0f, 216.0f),
                    PathNode.LineTo(122.0f, 138.6f),
                    PathNode.LineTo(51.09f, 181.15f),
                    PathNode.CurveTo(50.154743f, 181.70505f, 49.087547f, 181.9986f, 48.0f, 182.0f),
                    PathNode.CurveTo(45.2973f, 182.00969f, 42.921722f, 180.21118f, 42.197754f, 177.60724f),
                    PathNode.CurveTo(41.473785f, 175.0033f, 42.58015f, 172.23671f, 44.9f, 170.85f),
                    PathNode.LineTo(116.34f, 128.0f),
                    PathNode.LineTo(44.91f, 85.15f),
                    PathNode.CurveTo(42.065735f, 83.44344f, 41.14344f, 79.754265f, 42.85f, 76.91f),
                    PathNode.CurveTo(44.55656f, 74.065735f, 48.245735f, 73.14344f, 51.09f, 74.85f),
                    PathNode.LineTo(122.0f, 117.4f),
                    PathNode.LineTo(122.0f, 40.0f),
                    PathNode.CurveTo(122.0f, 36.68629f, 124.686295f, 34.0f, 128.0f, 34.0f),
                    PathNode.CurveTo(131.3137f, 34.0f, 134.0f, 36.68629f, 134.0f, 40.0f),
                    PathNode.LineTo(134.0f, 117.4f),
                    PathNode.LineTo(204.91f, 74.85f),
                    PathNode.CurveTo(207.75427f, 73.14344f, 211.44344f, 74.065735f, 213.15f, 76.91f),
                    PathNode.CurveTo(214.85657f, 79.754265f, 213.93427f, 83.44344f, 211.09f, 85.15f),
                    PathNode.LineTo(139.66f, 128.0f),
                    PathNode.LineTo(211.09f, 170.85f),
                    PathNode.CurveTo(212.4554f, 171.67007f, 213.4387f, 172.99939f, 213.82324f, 174.54501f),
                    PathNode.CurveTo(214.20776f, 176.09064f, 213.96198f, 177.72574f, 213.14f, 179.09f),
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
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
