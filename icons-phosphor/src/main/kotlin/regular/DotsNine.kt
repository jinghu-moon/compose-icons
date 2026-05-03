package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.DotsNine: ImageVector
    get() {
        if (_dotsNine != null) return _dotsNine!!
        _dotsNine = phosphorRegularIcon(
            name = "DotsNine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 72.000 60.000 C 72.000 66.627 66.627 72.000 60.000 72.000 C 53.373 72.000 48.000 66.627 48.000 60.000 C 48.000 53.373 53.373 48.000 60.000 48.000 C 66.627 48.000 72.000 53.373 72.000 60.000 ZM 128.000 48.000 C 121.373 48.000 116.000 53.373 116.000 60.000 C 116.000 66.627 121.373 72.000 128.000 72.000 C 134.627 72.000 140.000 66.627 140.000 60.000 C 140.000 53.373 134.627 48.000 128.000 48.000 ZM 196.000 72.000 C 202.627 72.000 208.000 66.627 208.000 60.000 C 208.000 53.373 202.627 48.000 196.000 48.000 C 189.373 48.000 184.000 53.373 184.000 60.000 C 184.000 66.627 189.373 72.000 196.000 72.000 ZM 60.000 116.000 C 53.373 116.000 48.000 121.373 48.000 128.000 C 48.000 134.627 53.373 140.000 60.000 140.000 C 66.627 140.000 72.000 134.627 72.000 128.000 C 72.000 121.373 66.627 116.000 60.000 116.000 ZM 128.000 116.000 C 121.373 116.000 116.000 121.373 116.000 128.000 C 116.000 134.627 121.373 140.000 128.000 140.000 C 134.627 140.000 140.000 134.627 140.000 128.000 C 140.000 121.373 134.627 116.000 128.000 116.000 ZM 196.000 116.000 C 189.373 116.000 184.000 121.373 184.000 128.000 C 184.000 134.627 189.373 140.000 196.000 140.000 C 202.627 140.000 208.000 134.627 208.000 128.000 C 208.000 121.373 202.627 116.000 196.000 116.000 ZM 60.000 184.000 C 53.373 184.000 48.000 189.373 48.000 196.000 C 48.000 202.627 53.373 208.000 60.000 208.000 C 66.627 208.000 72.000 202.627 72.000 196.000 C 72.000 189.373 66.627 184.000 60.000 184.000 ZM 128.000 184.000 C 121.373 184.000 116.000 189.373 116.000 196.000 C 116.000 202.627 121.373 208.000 128.000 208.000 C 134.627 208.000 140.000 202.627 140.000 196.000 C 140.000 189.373 134.627 184.000 128.000 184.000 ZM 196.000 184.000 C 189.373 184.000 184.000 189.373 184.000 196.000 C 184.000 202.627 189.373 208.000 196.000 208.000 C 202.627 208.000 208.000 202.627 208.000 196.000 C 208.000 189.373 202.627 184.000 196.000 184.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _dotsNine!!
    }

private var _dotsNine: ImageVector? = null
