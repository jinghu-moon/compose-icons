package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Code: ImageVector
    get() {
        if (_code != null) return _code!!
        _code = phosphorThinIcon(
            name = "Code",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M66.56 91.07 22.25 128l44.31 36.93c1.291 1.079 1.77 2.85 1.197 4.432-.573 1.582-2.074 2.636-3.757 2.638-.937 .004-1.844-.326-2.56-.93l-48-40c-.91-.76-1.436-1.884-1.436-3.07 0-1.186 .526-2.31 1.436-3.07l48-40c1.702-1.317 4.141-1.051 5.519 .602 1.378 1.653 1.202 4.1-.399 5.538ZM242.56 124.93l-48-40c-1.089-.978-2.626-1.283-4.006-.795-1.38 .488-2.384 1.691-2.616 3.137-.232 1.446 .344 2.902 1.502 3.798L233.75 128l-44.31 36.93c-1.158 .896-1.734 2.353-1.502 3.798 .232 1.446 1.235 2.649 2.616 3.137 1.38 .488 2.917 .183 4.006-.795l48-40c.91-.76 1.436-1.884 1.436-3.07 0-1.186-.526-2.31-1.436-3.07ZM161.37 36.24c-.997-.364-2.098-.316-3.06 .132-.962 .448-1.707 1.261-2.07 2.258L92.24 214.63c-.364 .997-.316 2.098 .132 3.06 .448 .962 1.261 1.707 2.258 2.07 .44 .157 .903 .238 1.37 .24 1.682 .001 3.184-1.05 3.76-2.63L163.76 41.37c.364-.997 .316-2.098-.132-3.06-.448-.962-1.261-1.707-2.258-2.07Z"),
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
        return _code!!
    }

private var _code: ImageVector? = null
