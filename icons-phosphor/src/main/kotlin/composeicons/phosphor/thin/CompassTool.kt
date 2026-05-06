package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CompassTool: ImageVector
    get() {
        if (_compassTool != null) return _compassTool!!
        _compassTool = phosphorThinIcon(
            name = "CompassTool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.56 121.82c.701-1.277 .653-2.835-.127-4.066-.78-1.231-2.168-1.94-3.622-1.852-1.455 .089-2.746 .961-3.371 2.278-8.463 16.263-22.011 29.312-38.58 37.16L146.18 111.05c13.365-7.844 20.211-23.361 16.994-38.521C159.957 57.37 147.399 45.97 132 44.23v-20.23c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v20.23C108.601 45.97 96.043 57.37 92.826 72.529c-3.217 15.16 3.628 30.677 16.994 38.521L60.35 222.37c-.901 2.01-.007 4.371 2 5.28 .518 .236 1.081 .356 1.65 .35 1.584 .001 3.019-.932 3.66-2.38l26.66-60c10.724 4.232 22.151 6.396 33.68 6.38 11.534-.012 22.97-2.12 33.75-6.22l26.59 59.84c.641 1.448 2.076 2.381 3.66 2.38 .559 .001 1.112-.118 1.62-.35 2.007-.909 2.901-3.27 2-5.28L169.08 162.64c18.252-8.582 33.177-22.925 42.48-40.82ZM100 80c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28C112.536 108 100 95.464 100 80ZM128 164c-10.409 .021-20.73-1.905-30.43-5.68l19.56-44c7.074 2.24 14.666 2.24 21.74 0l19.63 44.15c-9.756 3.645-20.085 5.518-30.5 5.53Z"),
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
        return _compassTool!!
    }

private var _compassTool: ImageVector? = null
