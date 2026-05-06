package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PersonSimpleSnowboard: ImageVector
    get() {
        if (_personSimpleSnowboard != null) return _personSimpleSnowboard!!
        _personSimpleSnowboard = phosphorRegularIcon(
            name = "PersonSimpleSnowboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 80c15.464 0 28-12.536 28-28C192 36.536 179.464 24 164 24c-15.464 0-28 12.536-28 28 0 15.464 12.536 28 28 28ZM164 40c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM218.25 112.32l-136-40c-4.239-1.248-8.687 1.176-9.935 5.415-1.248 4.239 1.176 8.687 5.415 9.935l40.85 12L85.07 150 40.34 137C26.991 133.098 13.007 140.756 9.105 154.105c-3.902 13.349 3.756 27.333 17.105 31.235L183.65 231c2.322 .665 4.725 1.001 7.14 1 12.553 .022 23.203-9.207 24.966-21.636 1.763-12.428-5.902-24.256-17.966-27.724L146.9 167.89l19.75-29.44c1.422-2.121 1.746-4.793 .873-7.192-.874-2.399-2.84-4.238-5.293-4.948L126.9 116.08l7.78-11.67 79.07 23.26c4.218 1.184 8.603-1.244 9.838-5.447 1.235-4.203-1.14-8.617-5.328-9.903ZM200 206.81c.004 2.878-1.358 5.587-3.67 7.3-2.347 1.777-5.397 2.333-8.22 1.5L30.67 170C26.746 168.864 24.033 165.285 24 161.2c-.008-2.876 1.35-5.586 3.66-7.3 2.348-1.781 5.404-2.338 8.23-1.5L193.33 198c3.93 1.134 6.644 4.72 6.67 8.81ZM147.25 138.63l-16.49 24.59-29.58-8.58 16.4-24.6Z"),
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
        return _personSimpleSnowboard!!
    }

private var _personSimpleSnowboard: ImageVector? = null
