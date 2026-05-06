package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.FileShield2Line: ImageVector
    get() {
        if (_fileShield2Line != null) return _fileShield2Line!!
        _fileShield2Line = remixIcon(
            name = "FileShield2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M14 9v-5h-9v16h6.056c.327 .417 .724 .785 1.18 1.085L13.626 22h-9.633C3.445 22 3 21.556 3 21.008v-18.016C3 2.455 3.449 2 4.002 2h10.995L21 8v1h-7ZM12 11h9v5.949c0 .991-.501 1.916-1.336 2.465l-3.164 2.083L13.336 19.414C12.501 18.865 12 17.94 12 16.949v-5.949ZM14 16.949c0 .316 .162 .614 .436 .795l2.064 1.359 2.064-1.359c.274-.181 .436-.479 .436-.795v-3.949h-5v3.949Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _fileShield2Line!!
    }

private var _fileShield2Line: ImageVector? = null
