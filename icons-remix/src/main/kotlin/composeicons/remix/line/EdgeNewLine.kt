package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.EdgeNewLine: ImageVector
    get() {
        if (_edgeNewLine != null) return _edgeNewLine!!
        _edgeNewLine = remixIcon(
            name = "EdgeNewLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M6.949 18.204C6.3 16.775 6 15.201 6 14 6 12.504 6.59 10.907 7.603 9.677 8.244 8.899 9.077 8.241 10.068 7.859 9.587 7.788 9.065 7.75 8.5 7.75 5.991 7.75 4 9.612 4 12c0 2.503 1.149 4.737 2.949 6.204ZM12 20c.928 0 1.82-.158 2.649-.449C11.285 18.994 9.001 16.938 8.029 14.588c.095 1.026 .429 2.296 1.029 3.357C9.777 19.217 10.753 20 12 20ZM16.5 12c0 .474-.064 .912-.188 1.315 .206 .022 .435 .035 .688 .035 1.777 0 3-1.234 3-2.85C20 7.37 16.704 4 12 4 9.981 4 8.136 4.748 6.728 5.983c.567-.152 1.162-.233 1.772-.233 2.407 0 4.396 .601 5.807 1.715 1.431 1.129 2.193 2.733 2.193 4.535ZM12 9.5C10.619 9.5 9.5 10.619 9.5 12c0 2.5 2.3 5.7 7 5.7 .442 0 .839-.031 1.196-.082 .309-.044 .587-.102 .835-.168 .192-.05 .367-.105 .526-.16 .137-.047 .262-.095 .375-.141 .132-.053 .247-.103 .347-.147 .208-.091 .351-.153 .437-.153 .184 0 .284 .1 .284 .3 0 .156-.071 .276-.284 .563-.042 .056-.089 .119-.142 .189L20.001 18c-.172 .229-.353 .45-.544 .663-.258 .288-.532 .561-.821 .818C16.871 21.048 14.547 22 12 22 6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4 10 8.5 0 2.8-2.2 4.85-5 4.85-2 0-3.4-.65-3.4-1.35 0-.139 .109-.254 .251-.404 .266-.281 .649-.683 .649-1.596C14.5 10.619 13.381 9.5 12 9.5Z"),
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
        return _edgeNewLine!!
    }

private var _edgeNewLine: ImageVector? = null
