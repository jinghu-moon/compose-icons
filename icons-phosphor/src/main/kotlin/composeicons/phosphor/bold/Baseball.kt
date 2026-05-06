package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Baseball: ImageVector
    get() {
        if (_baseball != null) return _baseball!!
        _baseball = phosphorBoldIcon(
            name = "Baseball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM77 194.66c3.139-4.015 5.993-8.245 8.54-12.66 2.313-3.719 2.416-8.404 .268-12.221-2.148-3.817-6.205-6.161-10.585-6.115-4.38 .046-8.387 2.475-10.454 6.337-1.462 2.505-3.054 4.931-4.77 7.27C38.626 147.901 38.626 108.099 60 78.73c1.716 2.339 3.308 4.765 4.77 7.27 2.067 3.862 6.074 6.291 10.454 6.337 4.38 .046 8.437-2.298 10.585-6.115C87.956 82.404 87.853 77.719 85.54 74 82.993 69.585 80.139 65.355 77 61.34c30.092-23.119 71.968-23.119 102.06 0-3.16 4.013-6.034 8.244-8.6 12.66-2.313 3.719-2.416 8.404-.268 12.221 2.148 3.817 6.205 6.161 10.585 6.115 4.38-.046 8.387-2.475 10.454-6.337 1.462-2.505 3.054-4.931 4.77-7.27 21.374 29.369 21.374 69.171 0 98.54-1.706-2.343-3.288-4.773-4.74-7.28-2.067-3.862-6.074-6.291-10.454-6.337-4.38-.046-8.437 2.298-10.585 6.115-2.148 3.817-2.045 8.502 .268 12.221 2.537 4.417 5.38 8.651 8.51 12.67-30.092 23.119-71.968 23.119-102.06 0ZM99.2 114.52c.542 4.473 .81 8.975 .8 13.48-0 4.506-.277 9.008-.83 13.48-.746 6.006-5.848 10.516-11.9 10.52-.501-.001-1.002-.031-1.5-.09-6.574-.822-11.239-6.815-10.42-13.39 .432-3.49 .649-7.003 .65-10.52-.001-3.517-.218-7.03-.65-10.52-.828-6.578 3.832-12.582 10.41-13.41 6.578-.828 12.582 3.832 13.41 10.41ZM170.26 151.91c-.498 .059-.999 .089-1.5 .09-6.052-.004-11.154-4.514-11.9-10.52-1.11-8.966-1.11-18.034 0-27 .828-6.578 6.832-11.238 13.41-10.41 6.578 .828 11.238 6.832 10.41 13.41-.863 6.973-.863 14.027 0 21 .404 3.168-.471 6.367-2.433 8.888-1.961 2.521-4.847 4.156-8.017 4.542Z"),
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
        return _baseball!!
    }

private var _baseball: ImageVector? = null
