package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Wrench: ImageVector
    get() {
        if (_wrench != null) return _wrench!!
        _wrench = phosphorLightIcon(
            name = "Wrench",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.91 69.75c-.739-1.826-2.327-3.173-4.249-3.604-1.922-.431-3.933 .109-5.381 1.444l-41.07 37.9-19.51-4.19L150.51 81.79 188.41 40.72c1.336-1.448 1.875-3.459 1.444-5.381-.431-1.922-1.778-3.51-3.604-4.249C159.597 20.286 129.048 26.882 109.229 47.722 89.409 68.561 84.353 99.403 96.48 125.48L35.09 178.48c-.11 .09-.21 .19-.32 .3-11.722 11.717-11.727 30.718-.01 42.44 11.717 11.722 30.718 11.727 42.44 .01 .11-.11 .21-.21 .3-.32l53-61.39c26.077 12.127 56.919 7.071 77.758-12.749 20.84-19.82 27.436-50.369 16.632-77.021ZM160 154c-9.793-.004-19.426-2.488-28-7.22-2.485-1.376-5.595-.821-7.45 1.33L68.57 212.88c-7.07 6.773-18.257 6.653-25.18-.27-6.923-6.923-7.043-18.11-.27-25.18l64.76-55.94c2.168-1.863 2.721-4.998 1.32-7.49C98.105 103.931 99.876 79.21 113.718 60.928 127.56 42.646 150.874 34.235 173.2 39.47L139.58 75.93c-1.321 1.435-1.862 3.423-1.45 5.33l5.65 26.35c.495 2.31 2.3 4.115 4.61 4.61l26.35 5.65c1.907 .412 3.895-.129 5.33-1.45L216.49 82.8c4.005 17.238-.07 35.362-11.07 49.226C194.42 145.891 177.698 153.981 160 154Z"),
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
        return _wrench!!
    }

private var _wrench: ImageVector? = null
