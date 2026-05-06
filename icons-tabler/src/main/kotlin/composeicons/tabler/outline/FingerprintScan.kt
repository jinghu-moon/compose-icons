package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FingerprintScan: ImageVector
    get() {
        if (_fingerprintScan != null) return _fingerprintScan!!
        _fingerprintScan = tablerOutlineIcon(
            name = "FingerprintScan",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9 11C9 9.343 10.343 8 12 8c1.657 0 3 1.343 3 3 0 1.657 .612 3.082 1 4")
            addPathData("M12 11v1.75c-.001 1.11 .661 2.206 1 3.25")
            addPathData("M9 14.25c.068 .58 .358 1.186 .5 1.75")
            addPathData("M4 8v-2C4 4.895 4.895 4 6 4h2")
            addPathData("M4 16v2c0 1.105 .895 2 2 2h2")
            addPathData("M16 4h2c1.105 0 2 .895 2 2v2")
            addPathData("M16 20h2c1.105 0 2-.895 2-2v-2")
        }
        return _fingerprintScan!!
    }

private var _fingerprintScan: ImageVector? = null
