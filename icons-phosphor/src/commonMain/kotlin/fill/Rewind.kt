package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Rewind: ImageVector
    get() {
        if (_rewind != null) return _rewind!!
        _rewind = phosphorFillIcon(
            name = "Rewind",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 71.84f),
                    PathNode.LineTo(232.0f, 184.16f),
                    PathNode.CurveTo(231.96988f, 189.9584f, 228.7895f, 195.28186f, 223.69794f, 198.05644f),
                    PathNode.CurveTo(218.60637f, 200.83102f, 212.4089f, 200.61786f, 207.52f, 197.5f),
                    PathNode.LineTo(128.0f, 146.86f),
                    PathNode.LineTo(128.0f, 184.16f),
                    PathNode.CurveTo(127.96987f, 189.9584f, 124.78951f, 195.28186f, 119.69794f, 198.05644f),
                    PathNode.CurveTo(114.60637f, 200.83102f, 108.408905f, 200.61786f, 103.52f, 197.5f),
                    PathNode.LineTo(15.33f, 141.34f),
                    PathNode.CurveTo(10.763373f, 138.44164f, 7.996664f, 133.40875f, 7.996664f, 128.0f),
                    PathNode.CurveTo(7.996664f, 122.591255f, 10.763373f, 117.55836f, 15.33f, 114.66f),
                    PathNode.LineTo(103.52f, 58.5f),
                    PathNode.CurveTo(108.40775f, 55.37503f, 114.608986f, 55.1582f, 119.70307f, 57.934143f),
                    PathNode.CurveTo(124.79715f, 60.710083f, 127.97648f, 66.03871f, 128.0f, 71.84f),
                    PathNode.LineTo(128.0f, 109.14f),
                    PathNode.LineTo(207.52f, 58.5f),
                    PathNode.CurveTo(212.40775f, 55.37503f, 218.609f, 55.1582f, 223.70305f, 57.934143f),
                    PathNode.CurveTo(228.79715f, 60.710083f, 231.97647f, 66.03871f, 232.0f, 71.84f),
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
        return _rewind!!
    }

private var _rewind: ImageVector? = null
